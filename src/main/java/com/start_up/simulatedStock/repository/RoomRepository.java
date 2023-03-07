package com.start_up.simulatedStock.repository;


import com.start_up.simulatedStock.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RoomRepository  extends JpaRepository<Room, Long> {

    Optional<Room> findBySecretCode(String secretCode);
}
