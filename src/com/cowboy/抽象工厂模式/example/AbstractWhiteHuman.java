package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 白色人种
 *
 * @author huxu
 * @create 2017-09-06 14:30
 * 抽象类不需要实现接口全部方法
 **/

public abstract class AbstractWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("this is whiteColor");
    }

    @Override
    public void talk() {
        System.out.println("this is whiteHuman talk");
    }

}
