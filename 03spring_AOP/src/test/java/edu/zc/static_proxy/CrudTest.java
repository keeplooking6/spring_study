package edu.zc.static_proxy;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 19:48
 */
public class CrudTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy Proxy= new UserServiceProxy();
        Proxy.setUserService(userService);
        Proxy.add();
    }
}
