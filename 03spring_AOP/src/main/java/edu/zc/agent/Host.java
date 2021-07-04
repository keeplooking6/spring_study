package edu.zc.agent;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 17:57
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
