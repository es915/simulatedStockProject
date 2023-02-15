package com.start_up.simulatedStock.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private UserState userState;

    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;

    @OneToOne
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

    public void setRoom(Room room){
        if(this.room != null){
            this.room.getUsers().remove(this);
        }
        this.room = room;
        room.getUsers().add(this);
    }

}
