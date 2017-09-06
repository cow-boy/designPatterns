package com.cowboy.抽象工厂模式.templet;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 场景类
 *
 * @author huxu
 * @create 2017-09-06 15:49
 **/

public class Client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA abstractProductA = creator1.creatorProductA();
        AbstractProductB abstractProductB = creator1.creatorProductB();
        AbstractProductA abstractProductA1 = creator2.creatorProductA();
        AbstractProductB abstractProductB1 = creator2.creatorProductB();
        /**
         * 接下来
         */
    }
}
