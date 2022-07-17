import java.util.ArrayList;


public class LambdaDemo 
{

	public static void main(String[] args) 
	{
		
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(53);
		    numbers.add(4);
		    numbers.add(82);
		    numbers.add(45);
		    numbers.forEach( (n) -> { System.out.println(n); } );
	}

}
