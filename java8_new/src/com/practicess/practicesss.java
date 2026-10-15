package com.practicess;

import java.util.function.Function;

public class practicesss {

    public static void main(String[] args) 
    {
    	mahesh mahesh=new mahesh();
     
    	Function <String,Integer> m=mahesh.aa();
    	  int t=m.apply("ganesh");
    	  System.out.println(t);
    }
    
    
}

class mahesh
{
	public Function<String ,Integer> aa()
	{
		Function <String,Integer> func=((x)->
		{
				return x.length();
		});
		return func;
		
	}
}