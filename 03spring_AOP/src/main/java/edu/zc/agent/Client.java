package edu.zc.agent;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 17:59
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);

        proxy.rent();
    }

}
