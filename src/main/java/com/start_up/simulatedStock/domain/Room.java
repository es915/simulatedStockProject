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
@ToString(exclude = "writer")

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long id;

    @Column(nullable = false)
    private UserType type;

    @Column(nullable = false)
    private String qr_code;

    @Column(nullable = false)
    private int round;

    @Column(nullable = false)
    private int time;

    @Column(nullable = false)
    private int seed;

    @OneToMany(mappedBy = "room")
    private List<User> users = new ArrayList<>();

}
