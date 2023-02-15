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
    private String name;

    @Column(nullable = false)
    private UserType type;

    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;

    @OneToOne
    @JoinColumn(name = "locker_id")
    private User_info info;

    public void setRoom(Room room){
        if(this.room != null){
            this.room.getUsers().remove(this);
        }
        this.room = room;
        room.getUsers().add(this);
    }

}
