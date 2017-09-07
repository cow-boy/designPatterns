package com.cowboy.模板方法模式.other;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 扩展后的H2悍马
 *
 * @author huxu
 * @create 2017-09-06 17:40
 **/

public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("start H2");
    }

    @Override
    protected void stop() {
        System.out.println("stop H2");
    }

    @Override
    protected void alarm() {
        System.out.println("alarm H2");
    }

    @Override
    protected void engineBoom() {
        System.out.println("engineBoom H2");
    }

    //默认没有喇叭
    protected boolean isAlarm(){
        return false;
    }

}
