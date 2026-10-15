package Practice;

import java.util.Arrays;

public class SumToReduce 
{
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		int  i=Arrays.stream(arr).reduce(0,(a,b)->{
			return a+b;
		});
		System.out.println(i);
	}
	

}
