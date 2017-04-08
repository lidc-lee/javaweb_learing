package org.smart4j.timer.example1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by AA on 2017/4/8.
 * 队列的方式，一个一个被顺序执行，前面一个耗时长则后面的任务被延后
 */
public class Run1_timer5 {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        Date runDate = calendar.getTime();
        System.out.println("A计划时间为：" + runDate);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 5);
        Date runDate2 = calendar2.getTime();
        System.out.println("B计划时间为：" + runDate2);

        TaskA task1 = new TaskA();
        TaskB task2 = new TaskB();
        Timer timer = new Timer();
        timer.schedule(task1, runDate);
        timer.schedule(task2, runDate2);
    }
}
