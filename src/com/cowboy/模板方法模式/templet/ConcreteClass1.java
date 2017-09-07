package com.cowboy.模板方法模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 具体模板类1
 *
 * @author huxu
 * @create 2017-09-06 17:00
 **/

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("doSomething1");
    }

    @Override
    protected void doAnything() {
        System.out.println("doAnything1");
    }
}
