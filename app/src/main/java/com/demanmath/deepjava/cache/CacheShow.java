package com.demanmath.deepjava.cache;/*
 * @author   demanmath
 * @date     2020/9/17
 */

import com.demanmath.deepjava.base.TraceLog;

public class CacheShow {

    public void fun1(){
        Integer a = new Integer(1);
        Integer b = Integer.valueOf(1);
        Integer c = Integer.valueOf(1);
        System.out.println(a==b);
        System.out.println(c==b);
        System.out.println(String.format("%x",a));
        System.out.println(String.format("%x",b));
        System.out.println(String.format("%x",c));
    }
}
