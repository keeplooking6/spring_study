package edu.zc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 12:09
 */
public class AnnotationAssembleTest {
    public static void main(String[] args) {
        String xmlPath = "edu/zc/annotation/beans6.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserController userController = (UserController) applicationContext.getBean("userController");
        System.out.println(userController);
        userController.save();
    }
}
