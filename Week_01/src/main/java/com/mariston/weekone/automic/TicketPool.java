package com.mariston.weekone.automic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/10/26 23:20
 */
public class TicketPool {

    private AtomicInteger ticketNum = new AtomicInteger(100);

    private Ticket[] tickets = new Ticket[100];

    public TicketPool() {
        for (int i = 0; i < 100; i++) {
            tickets[i] = Ticket.builder().ticketNo(i).build();
        }
    }

    public Ticket next() {
        if (ticketNum.get()>0) {
            return tickets[ticketNum.decrementAndGet()];
        }else{
            return null;
        }
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Ticket {
        private int ticketNo;
    }

    public static void main(String[] args) {
        TicketPool ticketPool = new TicketPool();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                boolean go = true;
                while (go) {
                    Ticket ticket = ticketPool.next();
                    if (ticket != null) {
                        System.out.println("ticketNo:" + ticket.ticketNo);
                    }else{
                        go = false;
                        System.out.println("ticket sold out ");
                    }
                }
            }).start();
        }
    }
}
