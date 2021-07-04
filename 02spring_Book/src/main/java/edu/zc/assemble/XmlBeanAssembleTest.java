package edu.zc.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: keeplooking
 * @Date: 2021/07/03 - 17:04
 */
public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        String xmlPath = "edu/zc/assemble/beans5.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user2"));
    }
}
