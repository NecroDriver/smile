package com.smile.rain.thread.memery_watch.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO
 *
 * @author zhoutt
 * @since 2019/3/25 11:40
 */
public class Test2 {

    private volatile static boolean done = false;

    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("Hello " + i);
            }
            done = true;
        };

        Runnable goodbye = () -> {
            int i = 1;
            while (!done) {
                i++;
            }
            System.out.println("Goodbye " + i);
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbye);

    }


}
