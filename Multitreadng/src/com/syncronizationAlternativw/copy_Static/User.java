package com.syncronizationAlternativw.copy_Static;

public class User extends Thread
{
	private Resource resource;
	
	public User(Resource r)
	{
		resource=r;
	}
   @Override
   public void run()
   {
//	   ek hi thread at a time do method me enter nahi krta  line by kine execute kata hai/
	   String name=Thread.currentThread().getName();
	   Resource.printer(name);
	   resource.printer2(name);
   }
}



//*****************************************************

 ek object do thread me do object banakar dekho

🔥 **"Agar threads do hain, to methods printer() aur printer2() ek hi object pe ho, aur synchronized na ho, to dono thread ek साथ alag-alag method me ghus sakte hain."

public class Resource {
    public void printer(String name) {
        System.out.println("Start printer: " + name);
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("End printer: " + name);
    }

    public void printer2(String name) {
        System.out.println("Start printer2: " + name);
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("End printer2: " + name);
    }
}



Resource resource = new Resource();

Thread t1 = new Thread(() -> {
    String name = Thread.currentThread().getName();
    resource.printer(name);
    resource.printer2(name);
});

Thread t2 = new Thread(() -> {
    String name = Thread.currentThread().getName();
    resource.printer(name);
    resource.printer2(name);
});

t1.setName("Thread-1");
t2.setName("Thread-2");

t1.start();
t2.start();


Start printer: Thread-1
Start printer: Thread-2
End printer: Thread-1
End printer: Thread-2
Start printer2: Thread-1
Start printer2: Thread-2
End printer2: Thread-1
End printer2: Thread-2



🛠 अगर aap synchronized laga do:
java
Copy code
public synchronized void printer(...) {}
public synchronized void printer2(...) {}
तो अब same object par printer() और printer2() dono ek thread ke liye lock hold karenge → doosra thread wait karega.

