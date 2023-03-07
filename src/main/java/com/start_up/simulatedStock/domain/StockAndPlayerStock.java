package com.start_up.simulatedStock.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class StockAndPlayerStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_stock_id")
    private PlayerStock playerStock;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;
}
