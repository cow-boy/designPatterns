package com.cowboy.工厂方法模式.example;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 白色人种
 *
 * @author huxu
 * @create 2017-09-01 12:09
 **/

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话大部分说英语");
    }
}
