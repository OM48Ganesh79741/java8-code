package interface5;

 interface java8Interface 
{
	
//	non static method by default publoic and abstract
 void speed();
 
 default void mileage()
 {
	 System.out.println("ite default metod");
 }
	
	//share same code to multiple classs
	public static void hello()
  {
	  System.out.println("hello");
  }
}
