package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/1.
 */

import com.cowboy.工厂方法模式.example.Human;
import com.cowboy.工厂方法模式.example.WhiteHuman;

/**
 * 多工厂模式 白色人种创建类
 *
 * @author huxu
 * @create 2017-09-01 13:55
 **/

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
