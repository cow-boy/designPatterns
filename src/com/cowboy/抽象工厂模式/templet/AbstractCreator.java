package com.cowboy.抽象工厂模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 抽象工厂类
 *
 * @author huxu
 * @create 2017-09-06 15:41
 * 抽象方法必须在抽象类中，抽象类中不一定有抽象方法
 **/

public abstract class AbstractCreator {

    //创建A类产品
    public abstract AbstractProductA creatorProductA();

    //创建B类产品
    public abstract AbstractProductB creatorProductB();
}
