package edu.zc.service;

import edu.zc.dao.UserDao;
import edu.zc.dao.UserDaoMysqlImpl;

/**
 * @Author: keeplooking
 * @Date: 2021/07/02 - 17:10
 */
public class UserDaoServiceImpl implements UserDaoService {
    private UserDao userDao;

    public void setUser(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
