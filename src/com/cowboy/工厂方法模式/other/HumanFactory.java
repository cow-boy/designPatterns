package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/1.
 */

import com.cowboy.工厂方法模式.example.Human;

/**
 * 简单工厂模式的工厂类
 *
 * @author huxu
 * @create 2017-09-01 13:43
 *
 * 直接定义为静态方法，去掉继承抽象类
 **/

public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> c) {
        //定义一个人种
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }

}
