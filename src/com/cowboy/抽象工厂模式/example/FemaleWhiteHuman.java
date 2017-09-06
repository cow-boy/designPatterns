package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 白色女性人种
 *
 * @author huxu
 * @create 2017-09-06 14:50
 **/

public class FemaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白色女性人种");
    }
}
