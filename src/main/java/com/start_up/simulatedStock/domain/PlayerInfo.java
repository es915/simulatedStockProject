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
public class PlayerInfo extends BaseTime{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_info_id")
    private Long id;

    @Column(nullable = false)
    private int seedMoney; // 보유 자산

    @Column(nullable = false)
    private float profitRate; // 손익률

    @OneToMany(mappedBy = "playerInfo")
    private List<PlayerStock> playerStockList = new ArrayList<>(); // 보유 주식 리스트

    @OneToOne(mappedBy = "playerInfo", fetch = FetchType.LAZY)
    private Player player; // 이 정보의 플레이어

    public static PlayerInfo createPlayerInfo(Player player) {
        return new PlayerInfo(player);
    }

    // 생성자
    private PlayerInfo(Player player) {
        this.player = player;
    }

    // 편의 메소드를 위한 세터문
    public void setPlayer(Player player) {
        this.player = player;
    }
}
