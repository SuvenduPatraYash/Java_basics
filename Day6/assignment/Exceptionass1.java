//D2-Q1
import java.util.Scanner;
public class Exceptionass1
{
	public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a integer: ");
       String str=sc.nextLine(); 
       try
       {
        int x=Integer.parseInt(str);
        System.out.println("The square value is:"+x*x);
       }
       catch(NumberFormatException e)
       {
        
        System.out.println("Entered number is not in valid format !!");
    
       }
    
	}
}