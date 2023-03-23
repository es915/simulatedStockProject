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

    @OneToMany(mappedBy = "room")
    private List<Stock> stocks = new ArrayList<>();

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
            if (optionType == 't') { // 최대 5분, 최소 1분
                if (this.timeLimit+operator*30 > 300 || this.timeLimit+operator*30 < 60 ) {
                    throw new IllegalStateException("최솟값 또는 최댓값을 넘어서는 값입니다.");
                } else {
                    this.timeLimit += operator*30;
                }
            } else if(optionType == 'r') { // 최대 15라운드, 최소 5라운드
                if (this.roundNumber+operator*1 > 15 || this.roundNumber+operator*1 < 5 ) {
                    throw new IllegalStateException("최솟값 또는 최댓값을 넘어서는 값입니다.");
                } else {
                    this.roundNumber += operator*1;
                }
            } else if (optionType == 's') { // 최대 500만원, 최소 50만원
                if (this.seedMoney+operator*500000 > 5000000 || this.seedMoney+operator*500000 < 500000 ) {
                    throw new IllegalStateException("최솟값 또는 최댓값을 넘어서는 값입니다.");
                } else {
                    this.seedMoney += operator*500000;
                }
            } else {
                throw new IllegalStateException("optionType 이 잘못 입력되었습니다.");
            }
        } else {
            throw new IllegalStateException("operator 가 잘못 입력되었습니다.");
        }

    }
}
