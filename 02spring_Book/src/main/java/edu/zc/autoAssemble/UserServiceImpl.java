package edu.zc.autoAssemble;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 11:41
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("UserService保存用户");
    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

//    public UserServiceImpl(UserDao userDao){
//        this.userDao = userDao;
//    }
}
