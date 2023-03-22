package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.StockDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDetailRepository extends JpaRepository<StockDetail, Long> {
}
