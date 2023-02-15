package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "round_stock")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RoundStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "round_id")
    private Long id;

    @Column(nullable = false)
    private int roundNum;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int upDown;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stock_id")
    private Stock stock;
}
