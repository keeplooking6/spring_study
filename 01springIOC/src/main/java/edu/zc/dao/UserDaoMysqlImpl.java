package edu.zc.dao;

/**
 * @Author: keeplooking
 * @Date: 2021/07/02 - 17:29
 */
public class UserDaoMysqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("用户的mysql数据库信息");
    }
}
