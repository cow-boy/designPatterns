package com.cowboy.工厂方法模式.other;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
 *
 * @author huxu
 * @create 2017-09-06 18:29
 **/

public class ShapeFactory {

    public static Object getClass(Class<?extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }

}
