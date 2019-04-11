package com.smile.rain.thread.memery_watch;

/**
 * 不进行 volatile 修饰的属性
 *
 * @author zhoutt
 * @since 2019/3/25 11:17
 */
public class Man_Yes {

    private volatile long size;

    public void incre() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        size++;
    }

    public long getSize() {
        return size;
    }

}
