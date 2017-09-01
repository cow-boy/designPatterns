package com.cowboy.工厂方法模式.templet;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 具体工厂类
 * @author huxu
 * @create 2017-09-01 13:29
 **/

public class ConcreteCreator extends Creator{
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;

        try {
            product = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
