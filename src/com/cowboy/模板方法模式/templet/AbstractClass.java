package com.cowboy.模板方法模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 抽象模板类
 *
 * @author huxu
 * @create 2017-09-06 16:53
 **/

public abstract class AbstractClass {

    //基本方法
    protected abstract void doSomething();
    protected abstract void doAnything();

    //模板方法
    public void templateMethod() {
        //调用基本方法
        this.doSomething();
        this.doAnything();
    }

}
