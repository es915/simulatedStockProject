package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.User;
import org.junit.jupiter.api.Test;

public class MemoryUserRepositoryTest {
    UserRepository repository = new MemoryUserRepository();

    @Test
    public void save(){
        User user = new User();
        user.setName("spring");

        repository.save(user);
        User result = repository.findById(user.getId()).get();
        System.out.println("result = " + (result == user));

    }


}
