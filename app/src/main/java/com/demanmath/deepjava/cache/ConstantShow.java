package com.demanmath.deepjava.cache;/*
 * @author   demanmath
 * @date     2020/9/17
 */

public class ConstantShow {

    public void fun(){
        String a = "123";
        String b = "123";
        String c = new String("123");
        String d = new String("123");
        System.out.println(a==b);
        System.out.println(a=="123");
        System.out.println(c.intern()=="123");
        System.out.println(c.intern()==d.intern());
    }
}
