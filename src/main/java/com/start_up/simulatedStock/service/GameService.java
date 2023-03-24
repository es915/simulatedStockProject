package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.*;
import com.start_up.simulatedStock.repository.*;
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
    private final StockRepository stockRepository;
    private final PlayerInfoRepository playerInfoRepository;

    // 게임 시작 버튼 클릭시 호출되는 함수
    // 게임 시작시 유저들 각 인포, 각 주식 생김, 공유 주식판 생성
    @Transactional
    public void gameStart(Long gameId) {
        Room room = findRoom(gameId); // 게임방 아이디

        // 게임방에 맞는 스톡 생성
        for (KindOfStock stocks : KindOfStock.values()) {
            Stock stock = Stock.createStock(stocks.toString());
            stock.setRoom(room);
            StockDetail.createStockDetail(stock, 1, 10000, 0); // 첫번째 라운드 디폴트
            stockRepository.save(stock);
        }

        for (Player player : room.getPlayerList()) { // 그 게임방에 속한 유저 한명씩 차례로 뽑고
            PlayerInfo playerInfo = PlayerInfo.createPlayerInfo(player, room.getSeedMoney()); // 각 유저 인포 생성
            playerInfoRepository.save(playerInfo);
        }
    }


    // 다음 라운드로 넘어가기
    @Transactional
    public void nextRound(Long gameId) {
        Room room = findRoom(gameId); // 게임방 아이디

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
