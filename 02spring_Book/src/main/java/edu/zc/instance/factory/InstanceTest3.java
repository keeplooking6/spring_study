package edu.zc.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: keeplooking
 * @Date: 2021/07/03 - 16:05
 */
public class InstanceTest3 {
    public static void main(String[] args) {
        String xmlPath = "edu.zc/instance/Beans3.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean3"));
    }
}
