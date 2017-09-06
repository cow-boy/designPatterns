package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 生产男性八卦炉
 *
 * @author huxu
 * @create 2017-09-06 15:21
 **/

public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
