package com.cowboy.工厂方法模式.templet;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 场景类
 *
 * @author huxu
 * @create 2017-09-01 13:32
 **/

public class Client {
    public static void main(String[] args) {
        Creator concrete = new ConcreteCreator();
        Product product1 = concrete.createProduct(ConcreteProduct1.class);
        /**
         * 其他业务处理
         */

    }
}
