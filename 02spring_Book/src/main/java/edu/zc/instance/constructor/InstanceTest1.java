package edu.zc.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: keeplooking
 * @Date: 2021/07/03 - 15:43
 */
public class InstanceTest1 {
    public static void main(String[] args) {
//       xml配置文件放到resources下
        String xmlPath = "edu.zc/instance/Beans1.xml";
//        从类路径寻找xml配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        获取配置文件中的bean实例
        Bean bean = (Bean)applicationContext.getBean("bean1");
//        调用bean方法
//        bean.info();
//        默认使用Bean实例中的无参构造方法
        System.out.println(bean);

    }
}
