package com.zxf.test;

public class Nested {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {


                if (j >= 10 - i) {

                    System.out.print("*");
                } else {
                    System.out.print(".");
                }


            }
            System.out.println();
        }
    }
}
