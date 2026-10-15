
package OneClassMultipleThread;

public class Launch 
{
	public static void main(String[] args) 
	{
		five f1=new five();
		five f2=new five();
	
		
		f1.start();
		f2.start();
	
	}

}
