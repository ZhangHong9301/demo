package com.zxf.callable;

import java.util.concurrent.Callable;

public class SubCallable implements Callable<Integer> {
    private int a;
    private int b;

    public SubCallable(int a,int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <=a ; i++) {
            sum+=i;
        }
        Thread.sleep(b);
        System.out.println("test1=========="+sum);
        return sum;
    }
}
