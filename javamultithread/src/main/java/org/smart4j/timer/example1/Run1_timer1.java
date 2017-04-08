package org.smart4j.timer.example1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by AA on 2017/4/8.
 * TTimer的构造方法会新启一个线程，且非守护线程
 */
public class Run1_timer1 {
    public static void main(String[] args){
        System.out.println("当前时间为："+ new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,1);
        Date runDate = calendar.getTime();

        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task,runDate);
    }
}
