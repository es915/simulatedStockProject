package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;

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
    private Integer round_2;

    @Column(nullable = false)
    private Integer time;

    @Column(nullable = false)
    private Integer seed;

}
