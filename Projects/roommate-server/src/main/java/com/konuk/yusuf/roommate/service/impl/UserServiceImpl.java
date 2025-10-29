package com.konuk.yusuf.roommate.service.impl;

import com.konuk.yusuf.roommate.model.User;
import com.konuk.yusuf.roommate.persistence.dao.UserDao;
import com.konuk.yusuf.roommate.service.contract.UserService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findByUuid(String uuid) {
        return userDao.findByUuid(uuid);
    }

    @Transactional
    @Override
    public User save(User user) {
        if (user != null) {
            user.setUuid(UUID.randomUUID().toString());
        }
        return userDao.persist(user);
    }
}
