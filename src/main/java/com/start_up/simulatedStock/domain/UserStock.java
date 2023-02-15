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
public class UserStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_stock_id")
    private Long id;

    @Column(nullable = false)
    private int totalPrice;

    @Column(nullable = false)
    private float lostGain;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name="user_info_id")
    private UserInfo userInfo;
}
