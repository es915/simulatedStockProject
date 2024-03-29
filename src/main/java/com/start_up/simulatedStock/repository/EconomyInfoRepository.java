package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.EconomyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EconomyInfoRepository extends JpaRepository<EconomyInfo, Long> {

    // 정보 생성 쿼리문
    @Query(value = "SELECT e FROM " +
            "economyInfo e " +
            "inner join stock s " +
            "on e.stock_id=s.stock_id " +
            "where s.stock_name=:stockName",
            nativeQuery = true)
    List<EconomyInfo> findAllByStock(@Param("stockName") String stockName);


}
