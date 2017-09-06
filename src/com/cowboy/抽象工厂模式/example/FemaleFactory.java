package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 生产女性的八卦炉
 *
 * @author huxu
 * @create 2017-09-06 15:19
 **/

public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
