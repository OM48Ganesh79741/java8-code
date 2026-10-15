package om.bifunction;
import java.util.function.Function;
public class Bifunction {

	public static void main(String[] args) 
	{
		Function<String ,Integer> func1=(s)->
		{
			return s.length();
		};
		Function <Integer ,Integer> func2=(s)->
		{
			return s*2;
		};
		
		Function <?,? > combinefunc=func1.andThen(func2);
		System.out.println(combinefunc.apply("ganesh"));
		
	}
}


