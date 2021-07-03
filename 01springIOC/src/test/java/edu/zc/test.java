package edu.zc;

import edu.zc.dao.UserDaoImpl;
import edu.zc.dao.UserDaoMysqlImpl;
import edu.zc.service.UserDaoServiceImpl;

/**
 * @Author: keeplooking
 * @Date: 2021/07/02 - 17:11
 */
public class test {
    public static void main(String[] args) {
        UserDaoServiceImpl service = new UserDaoServiceImpl();
        service.setUser(new UserDaoMysqlImpl());
        service.getUser();
    }
}
