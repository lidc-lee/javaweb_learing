package org.smart4j.meet;

/**
 * Created by Brian on 2016/4/10.
 */

/**
 * 打印当前线程名称
 */
public class printMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}

/*
output:
main
 */