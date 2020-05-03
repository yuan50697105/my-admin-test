package org.example.highly.concurrent;

/**
 * @program: java-learning
 * @description:
 * @author: yuane
 * @create: 2020-04-30 14:52
 */
public class HighlyConcurrentClient implements Runnable {
    //共享资源
    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        HighlyConcurrentClient test = new HighlyConcurrentClient();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            increase();
            System.out.println("i = " + i);
        }
    }


}