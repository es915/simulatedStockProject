package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private UserType type;

    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;
}
