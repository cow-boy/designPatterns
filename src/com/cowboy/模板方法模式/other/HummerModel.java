package com.cowboy.模板方法模式.other;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 扩展后的抽象模板类
 * @author huxu
 * @create 2017-09-06 17:19
 **/

public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    //钩子方法，默认true
    protected boolean isAlarm() {
        return true;
    }

}
