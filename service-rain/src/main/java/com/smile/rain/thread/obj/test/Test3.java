package com.smile.rain.thread.obj.test;


import com.smile.rain.thread.obj.Person;

/**
 * 测试不同线程执行同一个对象上不同的方法
 *
 * @author zhoutt
 * @since 2019/3/25 10:55
 */
public class Test3 {

    public static void main(String[] args) {
        Person p = new Person("王小明");
        Thread t1 = new Thread(() -> p.sayHello());
        Thread t2 = new Thread(() -> p.sayWorld());
        t1.start();
        t2.start();
    }

}
