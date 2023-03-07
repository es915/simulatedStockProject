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
    @GeneratedValue
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
}
