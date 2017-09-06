package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 黑色人种
 *
 * @author huxu
 * @create 2017-09-06 14:38
 * 抽象类中的方法要么是抽象的要么实现接口中的方法
 **/

public abstract class AbstractBlackHuman  implements  Human{

    @Override
    public void getColor() {
        System.out.println("this is blackColor");
    }

    @Override
    public void talk() {
        System.out.println("this is blackHuman talk");
    }
}
