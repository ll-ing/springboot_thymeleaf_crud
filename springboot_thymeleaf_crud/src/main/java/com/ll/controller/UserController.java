package com.ll.controller;

import com.ll.pojo.User;
import com.ll.repository.UserRepository;
import com.ll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * company: www.abc.com
 * Author: Administrator
 * Create Data: 2019/12/19
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public String findAll(Model model) {

        List<User> users = userService.findAll();
        model.addAttribute("users", users);

        return "userList";
    }
    @RequestMapping("findOne")
    public String findOne(Model model,Integer id){
        User user = userService.findOne(id);
        model.addAttribute("user",user);
        return "userUpdate";
    }


    @RequestMapping("update")
    public String update(User user){
        userService.update(user);
        return "redirect:findAll";
    }

    @RequestMapping("toAdd")
    public String toadd(){
        return "userAdd";//跳转到userAdd.html
    }
    @RequestMapping("save")
    public String save(User user){
        userService.save(user);
        return "redirect:findAll";
    }

    @RequestMapping("delete")
    public String delete(Integer id){
        userService.deleteById(id);
        return "redirect:findAll";
    }

}
