package com.zxf.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketManager implements Runnable {

    private int countTictet = 100;

    private final Lock lock = new ReentrantLock();

    public void payTictet() {
        while (countTictet > 0) {
            lock.lock();

            if (countTictet > 0) {
                try {

                    System.out.println(Thread.currentThread().getName() + " 出售第 " + countTictet-- + "张票");
                } finally {
                    lock.unlock();

                }
            }
        }
    }

    @Override
    public void run() {
        payTictet();
    }
}
