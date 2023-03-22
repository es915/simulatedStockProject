package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.KindOfStock;
import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StockService {

    private final RoomRepository roomRepository;

    // 룸이랑 연결된 스톡 만들기
    public void createStocks(Long roomId) {
        Room room = findRoom(roomId);
        List<KindOfStock> stocks = Arrays.asList(KindOfStock.values());

    }

    private Room findRoom(Long id) {
        Optional<Room> room = roomRepository.findById(id);
        if(room.isPresent()) {
            return room.get();
        } else {
            throw new IllegalStateException("게임방이 존재하지 않음.");
        }
    }
}
