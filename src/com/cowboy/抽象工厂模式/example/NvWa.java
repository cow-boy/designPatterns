package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 女娲重造人类
 *
 * @author huxu
 * @create 2017-09-06 15:23
 **/

public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();
        Human maleBlackHuman = maleFactory.createBlackHuman();
        Human femaleBlackHuman = femaleFactory.createBlackHuman();

        femaleBlackHuman.getColor();
        femaleBlackHuman.getSex();
        femaleBlackHuman.talk();
        /**
         * 后续创建
         */
    }
}
