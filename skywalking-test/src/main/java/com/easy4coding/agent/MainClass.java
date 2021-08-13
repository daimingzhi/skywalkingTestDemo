package com.easy4coding.agent;

import java.lang.reflect.Method;

/**
 * @author dmz
 * @date Create in 14:32 2021/8/13
 */
public class MainClass {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.easy4coding.jar.JarUtils");
        System.out.println(aClass.getName() + "loaded by" + aClass.getClassLoader());
        Method say = aClass.getDeclaredMethod("say");
        say.invoke(null);
    }
}
