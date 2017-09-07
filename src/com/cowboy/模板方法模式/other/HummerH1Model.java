package com.cowboy.模板方法模式.other;/**
 * Created by HUXU on 2017/9/6.
 */

/**
 * 扩展后的H1悍马
 *
 * @author huxu
 * @create 2017-09-06 17:32
 **/

public class HummerH1Model extends HummerModel {
    
    private boolean alarmFlag = true;
    
    @Override
    protected void start() {
        System.out.println("start H1");
    }

    @Override
    protected void stop() {
        System.out.println("stop H1");
    }

    @Override
    protected void alarm() {
        System.out.println("alarm H1");
    }

    @Override
    protected void engineBoom() {
        System.out.println("engineBoom H1");
    }

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭
    public void setAlarmFlag(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
