package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "writer")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private Integer user;
    private String name;

    private boolean type;

    @ManyToOne
    private int room_id;
}
