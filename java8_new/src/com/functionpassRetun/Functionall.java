package com.functionpassRetun;

public class Functionall 
{
	public static void main(String[] args) {
	Employee employee=new Employee();
	
	Car func=employee.test();
	
	System.out.println("***: "+func);
	func.add(2, 321);
	
		employee.abc(func);
	
	}

}
