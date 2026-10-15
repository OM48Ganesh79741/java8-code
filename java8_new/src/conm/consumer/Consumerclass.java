package conm.consumer;

import java.util.function.Consumer;

public class Consumerclass
{
//   public static void main(String[] args) 
//    {
//	  String arr[]= {"Ganesh","kiran","vishakha"};
//	  Consumer<String> c=new Consumer<String>() 
//	  {
//		  @Override
//		  public void accept(String s)
//		  {
//			  System.out.println(s);
//		  }
//	  };
//	  for(String s:arr)
//	  {
//		  c.accept(s);
//	  }
//    }
	
	
	 public static void main(String[] args) 
	    {
		  String arr[]= {"Ganesh","kiran","vishakha"};
		  Consumer<String> c=cc -> 
			 
				  System.out.println(cc);
			  

		  for(String s:arr)
		  {
			  c.accept(s);
		  }
	    }
}
