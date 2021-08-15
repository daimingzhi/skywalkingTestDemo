package com.easy4coding.agent;

import java.lang.reflect.Method;

/**
 * @author dmz
 * @date Create in 14:32 2021/8/13
 */
public class MainClass {
    public static void main(String[] args) throws Exception {

        // non static interceptor test
        Class<?> aClass1 = Class.forName("com.easy4coding.jar.Person");
        Object o = aClass1.getConstructor(String.class).newInstance("dmz");
        Method getName = aClass1.getMethod("getName");
        System.out.println(getName.invoke(o));


//        // static interceptor test
//        Class<?> aClass2 = Class.forName("com.easy4coding.jar.JarUtils");
//        System.out.println(aClass2.getName() + "loaded by" + aClass2.getClassLoader());
//        Method say = aClass2.getDeclaredMethod("say");
//        say.invoke(null);
//
////        System.in.read();
//
//        // constructor interceptor test
//        Class<?> constructorTestClass = Class.forName("com.easy4coding.jar.Son");
//        Object dmz = constructorTestClass.getConstructor(String.class).newInstance("dmz");
//
//        System.in.read();
    }
}
