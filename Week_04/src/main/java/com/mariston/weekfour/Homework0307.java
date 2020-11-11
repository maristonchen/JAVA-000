package com.mariston.weekfour;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * <p>
 * 一个简单的代码参考：
 */
public class Homework0307 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(8);

        long start = System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        for (int i = 0; i < 8; i++) {
            executorService.execute(new Calc(i * 3, cyclicBarrier));
        }
        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");

        // 然后退出main线程
        executorService.shutdown();
    }

    static class Calc implements Runnable {
        private int input;
        private CyclicBarrier cyclicBarrier;

        public Calc(int input, CyclicBarrier cyclicBarrier) {
            this.input = input;
            this.cyclicBarrier = cyclicBarrier;
        }

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            try {
                int result = fibo(input); //这是得到的返回值
                if (input == 3) {
                    throw new RuntimeException("出错了！！！");
                }
                // 确保  拿到result 并输出
                System.out.printf("[%s]异步计算结果为：%d %n", Thread.currentThread().getName(), result);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2) {
            return 1;
        }
        return fibo(a - 1) + fibo(a - 2);
    }
}
