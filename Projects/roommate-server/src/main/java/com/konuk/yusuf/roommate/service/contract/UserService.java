package com.konuk.yusuf.roommate.service.contract;

import com.konuk.yusuf.roommate.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByUuid(String uuid);
    User save(User user);
}
