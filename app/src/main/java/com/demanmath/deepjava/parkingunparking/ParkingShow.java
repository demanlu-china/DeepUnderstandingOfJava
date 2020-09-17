package com.demanmath.deepjava.parkingunparking;
/*
 * @author   demanmath
 * @date     2020/9/17
 */

import com.demanmath.deepjava.base.TraceLog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParkingShow {

    public void fun1(){
        List<Integer> list = new ArrayList();
        list.add(1);//list.add(Integer.valueOf(1))
        list.add(2);//list.add(Integer.valueOf(2))
        list.add(3);//list.add(Integer.valueOf(3))
        list.add(5);//list.add(Integer.valueOf(4))
        int sum = 0;
        for(int i:list){
            sum+=i;
        }
//        for(Iterator<Integer> iterator = list.iterator();iterator.hasNext();){
//            int i = ((Integer)iterator.next()).intValue();
//            sum +=i;
//        }
        TraceLog.d(String.valueOf(sum));
    }

    public void fun2(){
        int aa = 321;
        Integer a=1;
        Integer b=2;
        Integer c=3;
        Integer d=3;
        Integer e=321;
        Integer f=321;
        Long g=3L;
        Boolean bool = (g.longValue() == a.intValue()+b.intValue());
        Boolean bool2 = g.equals(a+b);

        System.out.println(c==d);//true 缓存池-128～127
        System.out.println(e==f);//false
        System.out.println(c==(a+b));//true
        System.out.println(c.equals(a+b));//true
        System.out.println(g==(a+b));//true 算术运算,自动拆箱，比较的是数值
        System.out.println(g.equals(a+b));//false equals，自动装箱，比较的是类，一个Long，一个Int，肯定不一样。
        System.out.println(g.equals(3));//false equals，自动装箱，比较的是类，一个Long，一个Int，肯定不一样。
        System.out.println(e==aa);
    }

}

