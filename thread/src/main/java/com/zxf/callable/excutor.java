package com.zxf.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class excutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executorService.submit(new SubCallable(100, 3000));
        Future<Integer> submit1 = executorService.submit(new SubCallable(200, 0));

        System.out.println(submit.get());

        System.out.println(submit1.get());
        executorService.shutdown();
        test();
    }

    public static void test() {
        int a = 2;
        int b = 2;
        if (b == a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
