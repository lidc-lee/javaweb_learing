package org.smart4j.timer.example1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by AA on 2017/4/8.
 * 启动守护进程，迅速结束，task任务未被执行
 */
public class Run1_timer2 {
    public static void main(String[] args){
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 5);
        Date runDate = calendar.getTime();

        MyTask task = new MyTask();
        Timer timer = new Timer(true);//守护线程
        timer.schedule(task, runDate);
    }
}
