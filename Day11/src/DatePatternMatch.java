import java.util.Scanner;

public class DatePatternMatch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your date: ");
	    String dt = sc.next();
	    String rg = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";
	    boolean result = dt.matches(rg);
	      if(result) 
	      {
	         System.out.println("This date is in valid format !!");
	      } 
	      else 
	      {
	         System.out.println("This date is not in valid format !!");
	      }

	}

}
