package com.cowboy.工厂方法模式.example;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 黄色人种
 *
 * @author huxu
 * @create 2017-09-01 12:11
 **/

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种很多说汉语");
    }
}
