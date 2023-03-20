package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Player;
import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.dto.PlayerDto;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    // 룸 생성
    @Transactional
    public void createGame() {
        String secretCode = getRandomPassword(6); // 비밀번호 자동 생성
        roomRepository.save(Room.createRoom(secretCode)); // 룸 생성
    }

    // 룸 참여
    @Transactional
    public void enterGame() {

    }

    // 룸 삭제
    @Transactional
    public void deleteGame(Long id) {
        roomRepository.deleteById(id);
    }

    // 게임방에 참여한 유저 리스트
    public List<PlayerDto> playerDtoList(Long id) {
        Room room = findRoom(id);
        List<PlayerDto> playerDtoList = new ArrayList<>();
        for (Player player : room.getPlayerList()) {
            playerDtoList.add(PlayerDto.toBoardDTO(player));
        }
        return playerDtoList;
    }

    // 비밀번호 랜덤 생성
    public String getRandomPassword(int size) {
        char[] charSet = new char[] {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '!', '@', '#', '$', '%', '^', '&' };
        StringBuffer sb = new StringBuffer();
        SecureRandom sr = new SecureRandom();
        sr.setSeed(new Date().getTime());
        int idx = 0;
        int len = charSet.length;
        for (int i=0; i<size; i++) {
            // idx = (int) (len * Math.random());
            idx = sr.nextInt(len);    // 강력한 난수를 발생시키기 위해 SecureRandom을 사용한다.
            sb.append(charSet[idx]);
        }
        String secretCode = sb.toString();
        Optional<Room> room =  roomRepository.findBySecretCode(secretCode);
        if (room.isPresent()) {
            getRandomPassword(6);
        }
        return secretCode;
    }

    // 게임방 찾는 메소드
    private Room findRoom(Long id) {
        Optional<Room> room = roomRepository.findById(id);
        if(room.isPresent()) {
            return room.get();
        } else {
            throw new IllegalStateException("게임방이 존재하지 않음.");
        }
    }


}
