package com.cowboy.抽象工厂模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 抽象产品类B
 * @author huxu
 * @create 2017-09-06 15:38
 **/

public abstract class AbstractProductB {

    //每个产品共有的方法
    public void shareMethod(){

    }

    //每个产品相同方法，不同实现
    public abstract void doSomeThing();

}
