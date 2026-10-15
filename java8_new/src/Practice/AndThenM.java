
package Practice;
import java.util.function.Function;

public class AndThenM {
	public static void main(String[] args) 
	{
		

		 Function<String, Integer> f1 = x -> x.length();

	        Function<Integer, Character> f2 = x -> (char) (x + 65);

	        Function<String, Character> combineF = f1.andThen(f2);

	        System.out.println(combineF.apply("ganesh"));
	
	}

}
