package com.lixun.kang;

//创建线程方式1，继承thread类，重写run()方法，调用start开启线程

//线程开启不一定立即执行，由cpu调度执行


public class test1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i=0;i<20;i++){
            System.out.println("我在看代码--"+(i+1));
        }
    }

    public static void main(String[] args){

        //创建线程对象
        test1 test1=new test1();
        //并行执行
        test1.start();

        for (int i=0;i<200;i++){
            System.out.println("我在学习多线程--"+(i+1));
        }
    }
}
