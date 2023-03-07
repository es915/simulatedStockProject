package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Room extends BaseTime {
    @Id @GeneratedValue
    @Column(name = "room_id")
    private Long id;

    @Column(nullable = false)
    private String secretCode; // 비밀번호

    @Column(nullable = false)
    private int roundNumber; // 라운드 수

    @Column(nullable = false)
    private int timeLimit; // 제한시간

    @Column(nullable = false)
    private int seedMoney; // 시드머니

    @OneToMany(mappedBy = "room")
    private List<Player> playerList = new ArrayList<>(); // 게임방의 참여자

}
