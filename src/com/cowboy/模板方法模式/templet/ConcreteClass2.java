package com.cowboy.模板方法模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 具体模板类2
 *
 * @author huxu
 * @create 2017-09-06 17:02
 **/

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("doSomeThing2");
    }

    @Override
    protected void doAnything() {
        System.out.println("doAnything2");
    }
}
