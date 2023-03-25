package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.repository.RoomRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.start_up.simulatedStock.domain.Room.createRoom;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@ExtendWith(SpringExtension.class)
//@DataJpaTest
@WebAppConfiguration
class RoomServiceTest {

    @Autowired
    private RoomRepository roomRepository;

    @Test
    void 게임생성테스트() {
        // given
        String code = "123456";

        // when
        Room room = createRoom(code);
        System.out.println(room.getId()); // null
        System.out.println("=============================");
        Room saveRoom = roomRepository.save(room);

        // then
        System.out.println(room.getId()); // 1
        assertEquals(code, saveRoom.getSecretCode());
        System.out.println("=============================");
    }

}