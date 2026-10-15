package waitAndNotify;

public class User extends Thread
{
    private Message message;

    public User(Message message) 
    {
        this.message = message;
    }

    public void run() 
    {
        String name = getName();

        if (name.equals("raju"))
        {
            for (int i = 1; i <= 10; i++)
            {
                message.sendMessage("Good morning " + i, name);
            }
        } else 
        {
            for (int i = 1; i <= 10; i++) {
                message.readMessage(name);
            }
        }
    }
}
