package com.smile.rain.thread.obj.test;


import com.smile.rain.thread.obj.Person;

/**
 * 测试不同对象执行同一个方法的情况
 *
 * @author zhoutt
 * @since 2019/3/25 10:52
 */
public class Test2 {

    public static void main(String[] args) {
        Person p1 = new Person("王小明");
        Person p2 = new Person("李大勇");
        Thread t1 = new Thread(() -> p1.sayHello());
        Thread t2 = new Thread(() -> p2.sayHello());
        t1.start();
        t2.start();
    }

}
