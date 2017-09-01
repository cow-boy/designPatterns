package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/1.
 */

import com.cowboy.工厂方法模式.example.Human;
import com.cowboy.工厂方法模式.example.YellowHuman;

/**
 * 多工厂模式 黄色人种创建类
 *
 * @author huxu
 * @create 2017-09-01 13:56
 **/

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
