package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Player;
import com.start_up.simulatedStock.domain.PlayerState;
import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.PlayerRepository;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PlayerService {
    private PlayerRepository playerRepository;
    private RoomRepository roomRepository;

    // 유저 생성
    // PlayerDto로 정보를 받아오기에 따로 변수를 받을 필요 없이 PlayerDto를 인자로 받고 get으로 가져오면 편함,
    // Optional<String> password 인자를 넣어 비밀번호를 받음
    @Transactional
    public Player join(String playerName, PlayerState playerState) {
        // 서비스에서 객체 생성 안좋음 -> 엔티티에서 생성메소드를 만들어 그걸 가지고 한번에 조립
        Player player = new Player();
        player.setPlayerName(playerName);
        player.setPlayerState(playerState);

        // 중복체크 좋아용, 하지만 한 게임방안에서 중복은 불가, 다른 게임방은 중복 가능하죠
        validateDuplicateMember(player);

        // 호스트인 경우 바로 게임 생성 로직 타면서 연결
        // 참가자일 경우 옵셔널 비밀번호와 같은 비밀번호를 가진 게임방 찾고 입장

        return playerRepository.save(player);
    }

    // Player의 아이디를 통한 중복 검사
    private void validateDuplicateMember(Player player) {
        // id로 중복 검사
        playerRepository.findById(player.getId())
                .ifPresent(m ->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
        // findByName도 가능하지만 동명이인 생각 
    }


    // 방 세팅
    public void joinRoom(Player player, Long roomId){
        Room room = roomRepository.findById(roomId).orElseThrow(() -> new IllegalArgumentException("Invalid room id"));
        player.setRoom(room);
    }

    // 전체 Player 조회
    public List<Player> findMembers(){
        return playerRepository.findAll();
    }

    // player 한명 조회
    public Optional<Player> findOne(Long playerId){
        return playerRepository.findById(playerId);
    }
}
