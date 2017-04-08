package org.smart4j.timer.example1;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by AA on 2017/4/8.
 */
public class MyTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("任务执行时间为："+ new Date());
    }
}
