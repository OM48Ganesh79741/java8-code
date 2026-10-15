package waitAndNotify;

public class Message {
    private String message;
    private boolean messageSend = false;

    public synchronized void sendMessage(String message, String name) {
        while (messageSend) 
        {
            try 
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

        this.message = message;
        System.out.println("MSH SEND: " + message + " by " + name);

        try 
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        messageSend = true;
        notify();
    }

    
    public synchronized void readMessage(String name)
    {
        while (!messageSend) 
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("MSH READ: " + message + " by " + name);

         try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        messageSend = false;
        notify();
    }
}
