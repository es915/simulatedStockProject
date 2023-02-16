package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DataJpaUserRepository extends JpaRepository<User, Long>, UserRepository {
    @Override
    Optional<User> findByName(String name);

}
