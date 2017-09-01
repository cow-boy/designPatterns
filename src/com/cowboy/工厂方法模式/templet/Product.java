package com.cowboy.工厂方法模式.templet;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 抽象产品类
 *
 * @author huxu
 * @create 2017-09-01 13:20
 **/

public abstract class Product {

    //产品类的公共方法
    public void method1() {
        System.out.println("业务处理");
    }

    //抽象方法
    public abstract void method2();

}
