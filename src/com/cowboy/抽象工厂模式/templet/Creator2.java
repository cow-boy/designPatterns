package com.cowboy.抽象工厂模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 产品等级2的实现类
 *
 * @author huxu
 * @create 2017-09-06 15:46
 **/

public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA creatorProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB creatorProductB() {
        return new ProductB2();
    }
}
