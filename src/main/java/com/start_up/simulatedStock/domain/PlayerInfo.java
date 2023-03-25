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

    @OneToOne(mappedBy = "playerInfo", fetch = FetchType.LAZY)
    private Player player; // 이 정보의 플레이어

    @OneToMany(mappedBy = "playerInfo")
    private List<PlayerStock> playerStockList = new ArrayList<>(); // 보유 주식 리스트

    public static PlayerInfo createPlayerInfo(Player player, int seedMoney) {
        return new PlayerInfo(player, seedMoney);
    }

    // 생성자 + 편의 메소드
    private PlayerInfo(Player player, int seedMoney) {
        this.seedMoney = seedMoney;
        this.profitRate = 0F;
        this.player = player;
        player.setPlayerInfo(this);
    }
}
