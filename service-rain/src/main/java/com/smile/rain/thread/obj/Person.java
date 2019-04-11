package com.smile.rain.thread.obj;

/**
 * 人物动作
 *
 * @author zhoutt
 * @since 2019/3/25 10:40
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public synchronized void sayHello() {
        System.out.println(name + "begin hello " + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "Hello");
        System.out.println(name + "after hello " + System.currentTimeMillis());
    }

    public synchronized void sayWorld() {
        System.out.println(name + "begin world " + System.currentTimeMillis());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "World");
        System.out.println(name + "after world " + System.currentTimeMillis());
    }

}
