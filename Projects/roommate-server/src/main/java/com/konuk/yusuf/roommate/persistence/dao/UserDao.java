package com.konuk.yusuf.roommate.persistence.dao;

import com.konuk.yusuf.roommate.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findByUuid(String uuid);
    User persist(User user);
}
