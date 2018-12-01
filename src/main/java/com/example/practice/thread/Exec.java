package com.example.practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author guoyuming
 * @date 2018/12/1 下午11:34
 */

public class Exec {
    public static void main(String[] args) {
        /**
         * Executor 管理多个异步任务的执行
         * CachedThreadPool：一个任务创建一个线程；
         * FixedThreadPool：所有任务只能使用固定大小的线程；
         * SingleThreadExecutor：相当于大小为 1 的 FixedThreadPool。
         */


        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());

        }
        executorService.shutdown();



    }

}
