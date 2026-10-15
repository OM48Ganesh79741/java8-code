package com.practicess;

import java.util.ArrayList;
import java.util.List;

public class Com {
	
	List<suresh> su=new ArrayList<>();
	suresh s=new suresh("ganesh",4);
	suresh s1=new suresh("manh",8);
	suresh s2=new suresh("gdh",2);
	
	su.addAll(s,s1,s2);
	
	Collections.sort(li,)
	

}
class suresh
{
	String name;
	int sal;
	
	
	public suresh(String name, int sal) {
		super();
		this.name = name;
		
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
