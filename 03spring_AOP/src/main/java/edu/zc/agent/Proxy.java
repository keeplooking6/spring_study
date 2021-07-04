package edu.zc.agent;

/**
 * @Author: keeplooking
 * @Date: 2021/07/04 - 17:59
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy(){

    }

    public Proxy(Host host){
        this.host = host;
    }

    public void rent(){
        host.rent();
    }

    public void sign(){
        System.out.println("签合同");
    }
}
