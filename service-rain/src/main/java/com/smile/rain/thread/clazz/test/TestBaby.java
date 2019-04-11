package com.smile.rain.thread.clazz.test;

import com.smile.rain.thread.clazz.Baby;

/**
 * @author creator mafh 2019/3/25 13:51
 * @author updater
 * @version 1.0.0
 */
public class TestBaby {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> Baby.cry("王宇"));
        Thread t2 = new Thread(() -> Baby.cry("长苏"));

        t1.start();
        t2.start();

    }
}
