package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RoomOptionService {

    private final RoomRepository roomRepository;

    // 설정값 변경 t - TimeLimit, r - RoundNumber, s - SeedMoney / up +1 , down -1
    @Transactional
    public void upTimeLimit(Long id) {
        Room room = findRoom(id);
        room.changeOption('t', 1);
        roomRepository.save(room);
    }

    @Transactional
    public void downTimeLimit(Long id) {
        Room room = findRoom(id);
        room.changeOption('t', -1);
        roomRepository.save(room);
    }

    @Transactional
    public void upRoundNumber(Long id) {
        Room room = findRoom(id);
        room.changeOption('r', 1);
        roomRepository.save(room);
    }

    @Transactional
    public void downRoundNumber(Long id) {
        Room room = findRoom(id);
        room.changeOption('r', -1);
        roomRepository.save(room);
    }

    @Transactional
    public void upSeedMoney(Long id) {
        Room room = findRoom(id);
        room.changeOption('s', 1);
        roomRepository.save(room);
    }

    @Transactional
    public void downSeedMoney(Long id) {
        Room room = findRoom(id);
        room.changeOption('s', -1);
        roomRepository.save(room);
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
