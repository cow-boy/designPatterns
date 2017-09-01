package com.cowboy.工厂方法模式.example;/**
 * Created by HUXU on 2017/9/1.
 */

/**
 * 人类创建工厂（八卦炉创建人类）
 *
 * @author huxu
 * @create 2017-09-01 12:17
 *
 * <T extends Human> T  只要实现了Human接口都可以作为参数
 **/

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个人种
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }

}
