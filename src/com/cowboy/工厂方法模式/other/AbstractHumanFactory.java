package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/1.
 */

import com.cowboy.工厂方法模式.example.Human;

/**
 * 多工厂模式的抽象工厂类
 *
 * @author huxu
 * @create 2017-09-01 13:52
 **/

public abstract class AbstractHumanFactory {

    public abstract Human createHuman();

}
