package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 白色男性人种
 *
 * @author huxu
 * @create 2017-09-06 14:51
 **/

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白色男性人种");
    }
}
