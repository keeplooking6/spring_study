package edu.zc.instance.factory;

/**
 * @Author: keeplooking
 * @Date: 2021/07/03 - 16:10
 */
public class Bean3Factory {
    public Bean3Factory(){
        System.out.println("bean的实例工厂");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
