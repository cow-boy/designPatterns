package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 黄色人种
 *
 * @author huxu
 * @create 2017-09-06 14:43
 **/

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("this is yellowColor");
    }

    @Override
    public void talk() {
        System.out.println("this is yellowHuman talk");
    }
}
