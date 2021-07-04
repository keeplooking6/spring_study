package edu.zc.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 11:43
 */
@Controller("userController")
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("UserController保存用户");
    }
}
