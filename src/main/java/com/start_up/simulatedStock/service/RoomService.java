package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RoomService {

    private final RoomRepository roomRepository;

    // 방 생성
    public Room createGame() {
        String code = makeRandomCode();
        return roomRepository.save(Room.create(code));
    }

    // 방 삭제
    public Long deleteGame(Long id) {
        roomRepository.deleteById(id);
        return id;
    }

    // 방 설정
    public void roundSetting(Long id, int bitSign) { // 0 : plus, 1 : minus
        Room room = roomCheck(id);
        if (bitSign==0) {

        }
    }



    // 참여자 리스트


    // findById 예외 처리
    private Room roomCheck(Long id) {
        if (roomRepository.findById(id).isPresent()) {
            return roomRepository.findById(id).get();
        } else {
            throw new IllegalStateException("존재하지 않는 객체 id 값");
        }
    }

    // 랜덤 코드 뽑기 중복 체크
    private String makeRandomCode() {
        String code = getRandomStr(6);
        if (roomRepository.findByQrCode(code).isPresent()) {
            makeRandomCode();
        } else {
            return code;
        }
        return "";
    }

    // 랜덤 코드 뽑기
    private String getRandomStr(int size) {
        if(size > 0) {
            char[] tmp = new char[size];
            for(int i=0; i<tmp.length; i++) {
                int div = (int) Math.floor( Math.random() * 2 );

                if(div == 0) { // 0이면 숫자로
                    tmp[i] = (char) (Math.random() * 10 + '0') ;
                }else { //1이면 알파벳
                    tmp[i] = (char) (Math.random() * 26 + 'A') ;
                }
            }
            return new String(tmp);
        }
        return "ERROR : Size is required.";
    }




}
