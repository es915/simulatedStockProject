package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long id;

    @Column(nullable = false)
    private String qrCode;

    @Column(nullable = false)
    private int round;

    @Column(nullable = false)
    private int timeLimit;

    @Column(nullable = false)
    private int seed;

    @OneToMany(mappedBy = "room")
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        this.users.add(user);
        if(user.getRoom() != this){
            user.setRoom(this);
        }
    }
    
    // 생성 메서드
    public static Room create(String qrCode) {
        // QR_code 제외 기본값
        return new Room(qrCode, 5, 180, 1000000);
    }

    private Room(String qrCode, int round, int timeLimit, int seed) {
        this.qrCode = qrCode;
        this.round = round;
        this.timeLimit = timeLimit;
        this.seed = seed;
    }


    public void timeSet(int sign) {
        if (sign==0) {
            this.timeLimit += 30;
        } else {
            this.timeLimit -= 30;
        }
    }

    public void roundSet(int sign) {
        if (sign==0) {
            this.timeLimit += 1;
        } else {
            this.timeLimit -= 1;
        }
    }

    public void seedSet(int sign) {
        if (sign==0) {
            this.timeLimit += 500000;
        } else {
            this.timeLimit -= 500000;
        }
    }





}
