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
public class Player extends BaseTime{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long id;

    @Column(nullable = false)
    private String playerName; // 닉네임

    @Column(nullable = false)
    private PlayerState playerState; // host or participate

    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room; // 참여하고 있는 게임방

    @OneToOne
    @JoinColumn(name = "player_info_id")
    private PlayerInfo playerInfo; // 유저의 정보 - 자산가치, 보유 주식, 손익률

    @OneToMany(mappedBy = "player")
    private List<PlayerStock> playerStocks = new ArrayList<>();

    // 편의 메소드
    public void setRoom(Room room) {
        this.room = room;
        room.getPlayerList().add(this);
    }

    // 편의 메소드
    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

//    public void setPlayerStock(PlayerStock playerStock) {
//        this.playerStock =
//    }
}
