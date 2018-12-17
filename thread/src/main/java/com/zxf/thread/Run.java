package com.zxf.thread;


public class Run {
    public static void main(String[] args) {
        SubRunnable subRunnable = new SubRunnable();
        Thread thread = new Thread(subRunnable);
        Thread thread2 = new Thread(subRunnable);
        thread.start();
        thread2.start();
    }
}
