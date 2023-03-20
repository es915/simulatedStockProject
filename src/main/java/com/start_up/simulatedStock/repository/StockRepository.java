package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockRepository extends JpaRepository<Stock, Long> {
    Optional<Stock> findByStockName(String stockName);
}
