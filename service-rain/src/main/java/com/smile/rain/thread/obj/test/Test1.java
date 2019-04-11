package com.smile.rain.thread.obj.test;


import com.smile.rain.thread.obj.Person;

/**
 * 测试不同线程执行同一个对象上面的相同的方法
 *
 * @author zhoutt
 * @since 2019/3/25 10:51
 */
public class Test1 {

    public static void main(String[] args) {
        final Person person = new Person("王小明");
        Runnable r1 = person::sayHello;
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();
    }

}
