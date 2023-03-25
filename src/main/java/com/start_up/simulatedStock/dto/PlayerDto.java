package com.start_up.simulatedStock.dto;

import com.start_up.simulatedStock.domain.Player;
import com.start_up.simulatedStock.domain.PlayerInfo;
import com.start_up.simulatedStock.domain.PlayerState;
import com.start_up.simulatedStock.domain.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
public class PlayerDto {

    private Long id;

    private String playerName; // 닉네임

    private PlayerState playerState; // host or participate

    // Entity -> Dto 변경
    public static PlayerDto toPlayerDTO(Player player) {
        return new PlayerDto(
                player.getId(),
                player.getPlayerName(),
                player.getPlayerState()
        );
    }

}
