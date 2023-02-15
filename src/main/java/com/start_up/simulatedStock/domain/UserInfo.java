package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id")
    private Long id;

    @Column(nullable = false)
    private int seedMoney;

    @Column(nullable = false)
    private float totalLostGain;

    @OneToMany(mappedBy = "userInfo")
    private List<UserStock> userStocks = new ArrayList<>();

    @OneToOne(mappedBy = "userInfo")
    private User user;
}
