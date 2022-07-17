import java.util.Scanner;

public class StringSplitDemo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a string: ");
	    String text = sc.nextLine();
	    
	    String[] result= text.split(" ");
	    System.out.println("After spliting out each word  ',' = ");
	    for(String str : result)
	    {
	    	System.out.print(str +" , ");
	    }
	    System.out.println("\nAfter spliting out each word with '-' = ");
	    for(String str : result)
	    {
	    	System.out.print(str +" - ");
	    }

	}

}
