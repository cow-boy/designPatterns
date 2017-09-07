package com.cowboy.模板方法模式.other;/**
 * Created by HUXU on 2017/9/6.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 扩展后的场景类
 *
 * @author huxu
 * @create 2017-09-06 17:49
 **/

public class Config {
    public static void main(String[] args) throws Exception{
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model h1 = new HummerH1Model();
        if (type.equals("0")) {
            h1.setAlarmFlag(false);
        }
        h1.run();

        System.out.println("----------------------");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
