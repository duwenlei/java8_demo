package com.hiooih.day48;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author duwenlei
 **/
public class ThreadTest {
    private static int IDX = 1;
    private static final int MAX_IDX = 100;
    private static final Lock lock = new ReentrantLock(true);

    private static void print() {
        new Thread(() -> {
            while (true) {
                lock.lock();
                try {
                    if (IDX <= MAX_IDX) {
                        System.out.printf("[%s] 打印 IDX=[%d]\n", Thread.currentThread().getName(), IDX);
                        IDX = IDX + 1;
                    } else {
                        break;
                    }
                } finally {
                    lock.unlock();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            print();
        }
    }
}
