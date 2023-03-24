package com.start_up.simulatedStock.dto;

import com.start_up.simulatedStock.domain.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RoomDto {

    private Long id; // 방 아이디

    private String secretCode; // 비밀번호

    private int roundNumber; // 라운드 수

    private int timeLimit; // 제한시간

    private int seedMoney; // 시드머니

    // Entity -> Dto 변경
    public static RoomDto toRoomDto(Room room) {
        return new RoomDto(
                room.getId(),
                room.getSecretCode(),
                room.getRoundNumber(),
                room.getTimeLimit(),
                room.getSeedMoney()
        );
    }

}
