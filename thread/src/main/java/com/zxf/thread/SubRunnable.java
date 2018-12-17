package com.zxf.thread;

public class SubRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"********test *********"+i);
        }
    }
}
