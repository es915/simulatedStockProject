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
public class Round_stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "round_1_id")
    private Long id;

    @Column(nullable = false)
    private int round_num;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int stock_id;

    @Column(nullable = false)
    private int up_down;

    @ManyToOne
    @JoinColumn(name="stock_id")
    private Stock stock;
}
