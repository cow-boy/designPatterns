package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/1.
 */

import com.cowboy.工厂方法模式.example.BlackHuman;
import com.cowboy.工厂方法模式.example.Human;
import com.cowboy.工厂方法模式.example.WhiteHuman;
import com.cowboy.工厂方法模式.example.YellowHuman;

/**
 * 简单工厂模式中的场景类
 *
 * @author huxu
 * @create 2017-09-01 13:45
 **/

public class NvWa {

    public static void main(String[] args) {
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
