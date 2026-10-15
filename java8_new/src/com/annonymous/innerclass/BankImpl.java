package com.annonymous.innerclass;

public class BankImpl 
{
  public void test()
  {
	  
//	***********  without lamda ***************************
//	  Bank bank=new Bank() {
//
//		@Override
//		public void transaction() {
//			
//			System.out.println("transition ");
//		}
//      
//	  };bank.transaction();
	 
	  //***********  with lamda expression  *************
	  
	  Bank bank=()-> {
				
				System.out.println("transition ");
			};
	      
		 bank.transaction();
  }
}
