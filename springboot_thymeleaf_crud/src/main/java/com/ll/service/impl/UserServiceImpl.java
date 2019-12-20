package com.ll.service.impl;

import com.ll.pojo.User;
import com.ll.repository.UserRepository;
import com.ll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * company: www.abc.com
 * Author: Administrator
 * Create Data: 2019/12/19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    // @Resource
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void save(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteById(Integer id) {

        userRepository.deleteById(id);
    }
}
