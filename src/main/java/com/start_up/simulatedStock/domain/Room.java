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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    // 생성 메서드
    public static Room createRoom(String secretCode) {
        return new Room(secretCode);
    }

    private Room(String secretCode) {
        this.secretCode = secretCode;
        this.roundNumber = 5;
        this.timeLimit = 300;
        this.seedMoney = 1000000;
    }


    // 옵션 변경
    public void changeOption(char optionType, int operator) {
        if (operator == 1 || operator == -1) {
            if (optionType == 't') {
                this.timeLimit += operator*30;
            } else if(optionType == 'r') {
                this.roundNumber += operator;
            } else if (optionType == 's') {
                this.seedMoney += operator*500000;
            } else {
                throw new IllegalStateException("optionType 이 잘못 입력되었습니다.");
            }
        } else {
            throw new IllegalStateException("operator 가 잘못 입력되었습니다.");
        }

    }
}
