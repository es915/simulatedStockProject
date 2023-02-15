package com.start_up.simulatedStock.repository;

import com.start_up.simulatedStock.domain.User;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class JpaUserRepository implements UserRepository{
    private final EntityManager em;

    public JpaUserRepository(EntityManager em) {
        this.em = em;
    }
    @Override
    public User save(User member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<User> findById(Long id) {
        User member = em.find(User.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<User> findByName(String name) {
        List<User> result = em.createQuery("select m from Member where m.name = :name", User.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("select m from Member m", User.class).getResultList();
    }
}
