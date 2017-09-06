package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 黑色男性人种
 *
 * @author huxu
 * @create 2017-09-06 14:53
 **/

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑色男性人种");
    }
}
