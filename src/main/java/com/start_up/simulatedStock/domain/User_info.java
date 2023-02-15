package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class User_info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id")
    private Long id;

    @Column(nullable = false)
    private int user_stock_id;

    @Column(nullable = false)
    private int seed_money;

    @Column(nullable = false)
    private float total_lost_gain;

    @OneToMany(mappedBy = "user_info")
    private List<User_stock> user_stock = new ArrayList<>();

    @OneToOne(mappedBy = "info")
    private User user;
}
