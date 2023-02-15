package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info_id")
    private Long id;

    @Column(nullable = false)
    private UserType type;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name="stock_id")
    private Stock stock;
}
