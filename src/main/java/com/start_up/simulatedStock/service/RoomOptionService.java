package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RoomOptionService {

    private final RoomRepository roomRepository;

    // 설정값 변경 t - TimeLimit, r - RoundNumber, s - SeedMoney / up +1 , down -1
    public void upTimeLimit(Long id) {
        Room room = roomRepository.findById(id).get();
        room.changeOption('t', 1);
        roomRepository.save(room);
    }

    public void downTimeLimit(Long id) {
        Room room = roomRepository.findById(id).get();
        room.changeOption('t', -1);
        roomRepository.save(room);
    }

    public void upRoundNumber(Long id) {
        Room room = roomRepository.findById(id).get();
        room.changeOption('r', 1);
        roomRepository.save(room);
    }

    public void downRoundNumber(Long id) {
        Room room = roomRepository.findById(id).get();
        room.changeOption('r', -1);
        roomRepository.save(room);
    }

    public void upSeedMoney(Long id) {
        Room room = roomRepository.findById(id).get();
        room.changeOption('s', 1);
        roomRepository.save(room);
    }

    public void downSeedMoney(Long id) {
        Room room = roomRepository.findById(id).get();
        room.changeOption('s', -1);
        roomRepository.save(room);
    }

}
