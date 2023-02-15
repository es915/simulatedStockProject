package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "stock")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
    private Long id;

    @Column(nullable = false)
    private String stock_name;

    @OneToMany(mappedBy = "stock")
    private List<User_stock> user_stock = new ArrayList<>();

    @OneToMany(mappedBy = "stock")
    private List<Round_stock> round_stock = new ArrayList<>();

    @OneToMany(mappedBy = "stock")
    private List<Info> info = new ArrayList<>();
}
