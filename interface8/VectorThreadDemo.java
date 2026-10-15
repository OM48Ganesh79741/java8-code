import java.util.Vector;

class MyThread extends Thread {

    Vector<Integer> v;

    MyThread(Vector<Integer> v) {
        this.v = v;
    }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            v.add(i);
            System.out.println(Thread.currentThread().getName() + " added " + i);
        }
    }
}

public class VectorThreadDemo {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        MyThread t1 = new MyThread(vector);
        MyThread t2 = new MyThread(vector);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final Vector: " + vector);
    }
}