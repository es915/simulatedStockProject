package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "user_stock")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User_stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_stock_id")
    private Long id;

    @Column(nullable = false)
    private int totalprice;

    @Column(nullable = false)
    private float lost_gain;

    @Column(nullable = false)
    private int stock_id;

    @ManyToOne
    @JoinColumn(name="stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name="user_stock_id")
    private User_info user_info;
}
