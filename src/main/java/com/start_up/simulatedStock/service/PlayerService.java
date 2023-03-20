package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Player;
import com.start_up.simulatedStock.domain.PlayerState;
import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.PlayerRepository;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private PlayerRepository playerRepository;
    private RoomRepository roomRepository;

    // 유저 생성
    public Player join(String playerName, PlayerState playerState) {
        Player player = new Player();
        player.setPlayerName(playerName);
        player.setPlayerState(playerState);

        validateDuplicateMember(player);

        return playerRepository.save(player);
    }

    // Player의 아이디를 통한 중복 검사
    private void validateDuplicateMember(Player player) {
        // id로 중복 검사
        playerRepository.findById(player.getId())
                .ifPresent(m ->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
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
