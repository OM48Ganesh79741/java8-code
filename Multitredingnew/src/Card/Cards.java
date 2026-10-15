package Card;

import com.syncronized.SyncronizedClass;

public class Cards extends Thread
{
 static double balance=5000;
	Double debit;
	
	public Cards(double debit )
	{
		this.debit=debit;
		
	}
	public void run()
	{
		deduct(debit,Thread.currentThread().getName());
	}
	public synchronized void deduct(double num,String name)
	{
//		 if(balance>=num)
//		 {
			 System.out.println("balance is: "+(balance=balance-num)+" : "+name);
//		 }
//		 else
//		 {
//			 System.out.println("your account does not have inup balance"+ " : "+name);
//		 }
	}

}
