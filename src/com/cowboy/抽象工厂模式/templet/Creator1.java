package com.cowboy.抽象工厂模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 产品等级1的实现
 *
 * @author huxu
 * @create 2017-09-06 15:44
 **/

public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA creatorProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB creatorProductB() {
        return new ProductB1();
    }
}
