package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Player;
import com.start_up.simulatedStock.domain.PlayerInfo;
import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.PlayerRepository;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GameService {

    private final RoomRepository roomRepository;
    private final PlayerRepository playerRepository;

    // 게임 시작 버튼 클릭시 호출되는 함수
    public void gameStart(Long id) {
        Room room = findRoom(id); // 게임방 아이디

        for (Player player : room.getPlayerList()) { // 그 게임방에 속한 유저 한명씩 차례로 뽑고
            PlayerInfo playerInfo = PlayerInfo.createPlayerInfo(player); //
            player.setPlayerInfo(playerInfo);
        }

    }

    private Room findRoom(Long id) {
        Optional<Room> room = roomRepository.findById(id);
        if(room.isPresent()) {
            return room.get();
        } else {
            throw new IllegalStateException("게임방이 존재하지 않음.");
        }
    }

    private Player findPlayer(Long id) {
        Optional<Player> player = playerRepository.findById(id);
        if(player.isPresent()) {
            return player.get();
        } else {
            throw new IllegalStateException("유저가 존재하지 않음.");
        }
    }

}
