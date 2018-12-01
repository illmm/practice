package com.example.practice.thread;

/**
 * @author guoyuming
 * @date 2018/12/1 下午11:24
 */

public class MyRunnable  implements Runnable{

    @Override
    public void run() {
        System.out.println("run");
    }


    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();

        Thread thread = new Thread(instance);
        thread.start();
    }
}
