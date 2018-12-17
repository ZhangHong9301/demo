package com.zxf.ticket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        TicketManager ticketManager = new TicketManager();
        executorService.execute(ticketManager);

        executorService.execute(ticketManager);

        executorService.execute(ticketManager);
        executorService.shutdown();

        /*TicketManager ticketManager = new TicketManager();
        Thread thread0 = new Thread(ticketManager);
        Thread thread1 = new Thread(ticketManager);
        Thread thread2 = new Thread(ticketManager);
        thread0.start();thread1.start();thread2.start();*/
    }
}
