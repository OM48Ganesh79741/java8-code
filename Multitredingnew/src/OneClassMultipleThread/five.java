package OneClassMultipleThread;

public class five  extends Thread
{
    
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(4000);
			}
			catch( InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
