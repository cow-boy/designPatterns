package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/1.
 */

import com.cowboy.工厂方法模式.example.BlackHuman;
import com.cowboy.工厂方法模式.example.Human;

/**
 * 多工厂模式 黑色人种创建工厂实现
 *
 * @author huxu
 * @create 2017-09-01 13:54
 **/

public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
