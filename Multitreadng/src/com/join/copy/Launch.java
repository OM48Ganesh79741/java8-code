package com.join.copy;

public class Launch {
    public static void main(String[] args) throws InterruptedException {
        Duplicate d = new Duplicate();
        d.start();

        Statict t = new Statict(d);
        t.start();

        d.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("hello " + i);
        }
    }
}
