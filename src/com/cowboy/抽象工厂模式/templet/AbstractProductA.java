package com.cowboy.抽象工厂模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 抽象产品类A
 *
 * @author huxu
 * @create 2017-09-06 15:32
 **/

public abstract class AbstractProductA {

    //每个产品共有的方法
    public void shareMethod(){

    }

    //每个产品相同方法，不同实现
    public abstract void doSomeThing();
}
