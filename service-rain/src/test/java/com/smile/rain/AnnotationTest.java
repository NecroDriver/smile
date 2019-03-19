package com.smile.rain;

import com.smile.rain.annotation.Hello;

import java.lang.reflect.Method;

/**
 * @author creator mafh 2019/3/19 13:37
 * @author updater
 * @version 1.0.0
 */
public class AnnotationTest {

    @Hello("test")
    public static void main(String[] args) throws NoSuchMethodException {
        Class cla = AnnotationTest.class;
        Method method = cla.getMethod("main", String[].class);
        Hello hello = method.getAnnotation(Hello.class);
        System.out.println(hello.value());
    }
}
