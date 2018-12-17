package com.zxf.springbootrabbitmq;

public class LiftOff {

    public static void main(String[] args) {
        LiftOffTest liftOffTest = new LiftOffTest();
        liftOffTest.run();
    }


}

class LiftOffTest implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOffTest() {
    }

    public LiftOffTest(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "),";
    }

    @Override
    public void run() {

        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }

}
