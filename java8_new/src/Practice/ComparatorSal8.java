package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ComparatorSal8 
{
  public static void main(String[] args) 
  {
	  List<ram> list=new ArrayList<>();
	  ram r1=new ram("ganesh",33);
	  ram r2=new ram("aba",36);
	  ram r3=new ram("pritam",22);
	  list.addAll(Arrays.asList(r1,r2,r3));
	  
	 Optional<ram> vrr= list.stream().sorted((x,y)->y.name.compareTo(x.name))
	  .distinct()
	  .skip(1)
	  .findFirst();
	 
	 ram o=vrr.get();
	  
	 System.out.println(o.name+":"+ o.sal);
 }
}
class ram
{
	String name;
	int sal;
	public ram(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
}
