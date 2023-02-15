package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Optional<Room> findByQrCode(String qrCode);

}
