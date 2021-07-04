package edu.zc.autoAssemble;

import org.springframework.stereotype.Repository;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 11:33
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao保存用户");
    }

}
