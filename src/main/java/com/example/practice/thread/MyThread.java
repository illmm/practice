package com.example.practice.thread;

/**
 * @author guoyuming
 * @date 2018/12/1 下午11:32
 */

public class MyThread  extends Thread {
    public void run(){
        System.out.println("run");

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

}
