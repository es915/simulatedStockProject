package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.PlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerInfoRepository extends JpaRepository<PlayerInfo, Long> {
}
