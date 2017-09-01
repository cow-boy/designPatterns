package com.cowboy.工厂方法模式.templet;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 抽象工厂类
 *
 * @author huxu
 * @create 2017-09-01 13:25
 **/

public abstract class Creator {

    /**
     * 创建一个产品对象，其输入参数类型可以自行设计
     */
    public abstract <T extends Product> T createProduct(Class<T> c);

}
