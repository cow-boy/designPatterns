package com.cowboy.模板方法模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 抽象悍马模型
 *
 * @author huxu
 * @create 2017-09-06 16:35
 **/

public abstract class HummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    };

}
