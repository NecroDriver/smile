package com.smile.rain.thread.clazz;

/**
 * 静态方法锁定类
 *
 * @author creator mafh 2019/3/25 13:46
 * @author updater
 * @version 1.0.0
 */
public class Baby {

    public synchronized static void cry(String name) {
        System.out.println(name + " cry beginTime:" + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " cry ........");
        System.out.println(name + " cry endTime:" + System.currentTimeMillis());
    }

    public synchronized static void eat(String name) {
        System.out.println(name + " eat beginTime:" + System.currentTimeMillis());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " eat ........");
        System.out.println(name + " eat endTime:" + System.currentTimeMillis());
    }
}
