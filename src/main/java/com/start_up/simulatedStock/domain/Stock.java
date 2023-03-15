package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Stock extends BaseTime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
    private Long id;

    @Column(nullable = false)
    private String stockName; // 종목 이름

    @OneToMany(mappedBy = "stock") // Stock - PlayerStock 사이 다대다 풀이
    private List<StockAndPlayerStock> stockAndPlayerStockList = new ArrayList<>(); // 다대다 중간 리스트

    @OneToMany(mappedBy = "stock")
    private List<StockDetail> stockDetails = new ArrayList<>(); // 종목의 라운드 별 주식정보

    @OneToMany(mappedBy = "stock")
    private List<EconomyInfo> economyInfo = new ArrayList<>(); // 종목의 정보들
}
