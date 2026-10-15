package com.priority;

public class Prio
{
    public static void main(String[] args)
    {
        Test t = new Test();

        ganesh g = new ganesh(t);
        g.setName("g");

        ganesh g1 = new ganesh(t);
        g1.setName("g1");

        g.start();
        g1.start();
    }
}

class ganesh extends Thread
{
    Test t;

    public ganesh(Test t)
    {
        this.t = t;
    }

    public void run()
    {
        t.display();
    }
}

class Test
{
    synchronized void display()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName());

            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}