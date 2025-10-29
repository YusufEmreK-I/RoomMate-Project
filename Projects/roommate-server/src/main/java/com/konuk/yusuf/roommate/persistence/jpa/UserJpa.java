package com.konuk.yusuf.roommate.persistence.jpa;

import com.konuk.yusuf.roommate.model.User;
import com.konuk.yusuf.roommate.persistence.dao.UserDao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class UserJpa implements UserDao {

    @Inject
    EntityManager em;

    @Override
    public List<User> findAll() {
        List<User> users = em.createQuery("SELECT u FROM User u", User.class)
                .getResultList();
        return users;
    }

    @Override
    public User findByUuid(String uuid) {
        User user = em.find(User.class, uuid);
        return user;
    }

    @Override
    public User persist(User user) {
        em.persist(user);
        return user;
    }
}
