package com.cowboy.模板方法模式.example;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 场景类
 *
 * @author huxu
 * @create 2017-09-06 16:44
 **/

public class Client {

    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();
    }
}
