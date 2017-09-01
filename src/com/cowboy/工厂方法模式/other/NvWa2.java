package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/1.
 */

import com.cowboy.工厂方法模式.example.Human;

/**
 * 多工厂模式场景类
 *
 * @author huxu
 * @create 2017-09-01 13:57
 **/

public class NvWa2 {

    public static void main(String[] args) {
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
