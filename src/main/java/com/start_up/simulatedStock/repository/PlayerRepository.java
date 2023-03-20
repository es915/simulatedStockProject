package com.start_up.simulatedStock.repository;


import com.start_up.simulatedStock.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    public Player findByName(String name);
}
