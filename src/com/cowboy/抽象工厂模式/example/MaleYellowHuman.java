package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 黄色男性人种
 *
 * @author huxu
 * @create 2017-09-06 14:49
 **/

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄色男性人种");
    }
}
