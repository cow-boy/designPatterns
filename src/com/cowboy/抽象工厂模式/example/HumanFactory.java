package com.cowboy.抽象工厂模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 八卦炉定义
 *
 * @author huxu
 * @create 2017-09-06 15:17
 **/

public interface HumanFactory {

    public Human createYellowHuman();

    public Human createBlackHuman();

    public Human createWhiteHuman();

}
