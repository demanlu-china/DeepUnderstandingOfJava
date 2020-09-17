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
}

