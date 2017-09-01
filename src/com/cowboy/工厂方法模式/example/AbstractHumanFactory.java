package com.cowboy.工厂方法模式.example;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 抽象人创建工厂（一个八卦炉）
 *
 * @author huxu
 * @create 2017-09-01 12:14
 **/

public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);

}
