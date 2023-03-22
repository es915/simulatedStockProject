package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StockDetail extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_detail_id")
    private Long id;

    @Column(nullable = false)
    private int roundNumber;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int upDown;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stock_id")
    private Stock stock;

    public static StockDetail createStockDetail(Stock stock, int roundNumber, int price, int upDown) {
        return new StockDetail(stock, roundNumber, price, upDown);
    }

    private StockDetail(Stock stock, int roundNumber, int price, int upDown) {
        this.stock = stock;
        this.roundNumber = roundNumber;
        this.price = price;
        this.upDown = upDown;
    }
}
