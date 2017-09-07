package com.cowboy.模板方法模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 场景类
 *
 * @author huxu
 * @create 2017-09-06 17:03
 **/

public class Client {

    public static void main(String[] args) {
        AbstractClass concreteClass1 = new ConcreteClass1();
        AbstractClass concreteClass2 = new ConcreteClass2();
        //调用模板方法
        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}
