package edu.zc.autoAssemble;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 11:43
 */
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("UserController保存用户");
    }

    public void setUserService(UserService userService){
        this.userService = userService;
    }

//    public UserController(UserService userService){
//        this.userService = userService;
//    }
}
