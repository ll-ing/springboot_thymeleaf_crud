package com.ll.repository;

import com.ll.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: wyan
 * @Date: 2019-12-19 09:45
 * @Description:
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
