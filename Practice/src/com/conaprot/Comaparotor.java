

package com.conaprot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comaparotor 
{
	public static void main(String[] args) 
	{
		
		ramesh r=new ramesh("ram",350.90f);
		ramesh r1=new ramesh("gan",30.90f);
		ramesh r2=new ramesh("san",50.90f);
		
		List<ramesh> list=new ArrayList<>();
		list.addAll(Arrays.asList(r,r1,r2));
		
		Comparator<ramesh> sa=(e1,e2)->
		{
			 return Float.compare(e1.sal,e2.sal);
			
		};
		
		Collections.sort(list,sa);
		System.out.println(list.get(1));
	}

}
class ramesh
{
	String name;
	float sal;
	
	public ramesh(String name, float sal) 
	{
		super();
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString()
	{
	    return name + " " + sal;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	
	
	
}
