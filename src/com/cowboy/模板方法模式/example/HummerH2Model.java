package com.cowboy.模板方法模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * H1型号悍马
 *
 * @author huxu
 * @create 2017-09-06 16:37
 **/

public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("start H2");
    }

    @Override
    public void stop() {
        System.out.println("stop H2");
    }

    @Override
    public void alarm() {
        System.out.println("alarm H2");
    }

    @Override
    public void engineBoom() {
        System.out.println("engineBoom H2");
    }

   /* @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }*/
}
