package org.smart4j.timer.example1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by AA on 2017/4/8.
 * 多个TimerTask任务及延时
 */
public class Run1_timer4 {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 5);
        Date runDate = calendar.getTime();
        System.out.println("计划1时间为：" + runDate);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 10);
        Date runDate2 = calendar2.getTime();
        System.out.println("计划2时间为：" + runDate2);

        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task1, runDate);
        timer.schedule(task2, runDate2);
    }
}
