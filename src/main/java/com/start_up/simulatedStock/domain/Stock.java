package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "stocks")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
    private Long id;

    @Column(nullable = false)
    private String stockName;

    @OneToMany(mappedBy = "stock")
    private List<UserStock> userStocks = new ArrayList<>();

    @OneToMany(mappedBy = "stock")
    private List<RoundStock> roundStocks = new ArrayList<>();

    @OneToMany(mappedBy = "stock")
    private List<StockInfo> stockInfo = new ArrayList<>();
}
