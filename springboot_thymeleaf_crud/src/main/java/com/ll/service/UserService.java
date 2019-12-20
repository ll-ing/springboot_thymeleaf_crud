package com.ll.service;

import com.ll.pojo.User;

import java.util.List;

/**
 * company: www.abc.com
 * Author: Administrator
 * Create Data: 2019/12/19
 */
public interface UserService {
    List<User> findAll();

    User findOne(Integer id);

    void update(User user);

    void save(User user);

    void deleteById(Integer id);
}
