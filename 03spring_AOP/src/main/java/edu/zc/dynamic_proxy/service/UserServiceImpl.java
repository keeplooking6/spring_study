package edu.zc.dynamic_proxy.service;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 19:46
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");

    }

    @Override
    public void alter() {
        System.out.println("修改用户");

    }

    @Override
    public void search() {
        System.out.println("删除用户");
    }
}
