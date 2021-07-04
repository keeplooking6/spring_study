package edu.zc.static_proxy;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 19:49
 */

//代理角色，增加日志的实现
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }

    @Override
    public void add() {
        log("增加用户日志");
        userService.add();
    }

    @Override
    public void delete() {
        log("删除用户日志");
        userService.delete();
    }

    @Override
    public void alter() {
        log("修改用户日志");
        userService.alter();
    }

    @Override
    public void search() {
        log("查询用户日志");
        userService.search();
    }

    public void log(String info){
        System.out.println(info);
    }
}
