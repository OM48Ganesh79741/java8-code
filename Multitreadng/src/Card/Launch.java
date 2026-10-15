package Card;

public class Launch
{
	public static void main(String[] args) 
	{
		Cards c1=new Cards(4000);
		c1.setName("card1thtread");
	
		Cards c2=new Cards(4500);
		c2.setName("card2thtread");
		
	
		c1.start();
		c2.start();
		
	
		
	}

}
//
//balance is: 1000.0 : card1thtread  5000-4000 ab balance hai 1000
//balance is: -3500.0 : card2thtread   1000-45000 ab balance hai -3500
//se syncronized nahi hai tab bhi kai bar syncronized jaisa behave jkarta hai becz second thread thoda late ha jata hai

