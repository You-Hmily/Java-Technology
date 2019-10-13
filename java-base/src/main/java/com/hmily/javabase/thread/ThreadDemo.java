package com.hmily.javabase.thread;

/**
 * Created by zyzhmily on 2019/4/2.
 */
public class ThreadDemo {


    public static void main(String[] args) throws InterruptedException {
        //Thread 实现了 Runnable
        // 如果没有传递Runnnable 对象实现，空执行
        Thread thread=new Thread(ThreadDemo::sayHelloWorld);//方法引用
        thread.start();//启动线程
        thread.join();//等待线程结束
        System.out.println("NEXT.......");
        System.out.println(thread.getState());

    }

    public static void sayHelloWorld(){
        System.out.printf("线程[Id : %s] : Hello World!\n",Thread.currentThread().getId());
    }
}
