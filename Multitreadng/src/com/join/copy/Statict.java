package com.join.copy;

public class Statict extends Thread {
    private final Duplicate d;

    public Statict(Duplicate d) {
        this.d = d; // Launch से pass किया हुआ वही Duplicate ऑब्जेक्ट लेता है
    }

    @Override
    public void run() {
        try {
            d.join(); // Duplicate के खत्म होने तक Statict रुकेगा
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " staic " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
