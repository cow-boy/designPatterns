package com.cowboy.工厂方法模式.example;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 黑色人种
 *
 * @author huxu
 * @create 2017-09-01 12:07
 **/

public class BlackHuman implements Human{


    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说话听不懂");
    }
}
