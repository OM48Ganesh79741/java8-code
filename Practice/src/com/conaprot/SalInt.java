package com.conaprot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalInt
{
    public static void main(String[] args)
    {

        ramesh1 r = new ramesh1("ram",350);
        ramesh1 r1 = new ramesh1("gan",30);
        ramesh1 r2 = new ramesh1("san",50);

        List<ramesh1> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(r,r1,r2));
        
        Collections.sort(list2,new sortByname());
        
        for(ramesh1 s:list2)
        {
        	System.out.println(s.getSal());
        }
 
        System.out.println(list2.get(1));
        
    }
}

class ramesh1
{
    String name;
    int sal;

    public ramesh1(String name, int sal)
    {
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
    
}

class sortByname implements Comparator<ramesh1>
{
	

	@Override
	public int compare(ramesh1 o1, ramesh1 o2) {
		return Integer.compare(o2.getSal(),o1.getSal());
		
	}
}
