package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlayerStock extends BaseTime{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_stock_id")
    private Long id;

    @Column(nullable = false)
    private int totalPrice; // 총금액

    @Column(nullable = false)
    private float upAndDown; // 등락

    private int number; // 매수 갯수

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stock_id")
    private Stock stock; // 주식 종목

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="player_id")
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="player_info_id")
    private PlayerInfo playerInfo; // 주식을 가지고 있는 플레이어


    public static PlayerStock createPlayerStock(Player player) {
        return new PlayerStock(player);
    }

    // 생성자 + 편의 메소드
    private PlayerStock(Player player) {
        this.player = player;
        player.getPlayerStocks().add(this);
    }
}
