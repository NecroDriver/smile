package com.smile.rain.thread.memery_watch.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO
 *
 * @author zhoutt
 * @since 2019/3/25 11:35
 */
public class Test1 {

    private static boolean done = false;

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
            // 这里不会输出
            System.out.println("Goodbye " + i);
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(goodbye);
        executor.execute(hellos);

    }

}
