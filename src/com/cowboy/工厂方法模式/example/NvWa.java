package com.cowboy.工厂方法模式.example;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 女娲用八卦炉开始造人啦
 *
 * @author huxu
 * @create 2017-09-01 12:24
 **/

public class NvWa {

    public static void main(String[] args) {

        AbstractHumanFactory humanFactory = new HumanFactory();
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }

}
