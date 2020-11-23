package com.supermarket.sellergoods.service.impl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();

        List<Long> list=new ArrayList();
        list.add((long) 22);
        list.add((long) 23);
        list.add((long) 24);
        list.add((long) 25);
        list.add((long) 26);

        //增强for循环
//        for (Long id:list){
//            System.out.println(id);
//        }

        //迭代器输出
        Iterator<Long> ids=list.iterator();
        while (ids.hasNext()){
            Long id=ids.next();
            System.out.println(id);
        }
    }
}
