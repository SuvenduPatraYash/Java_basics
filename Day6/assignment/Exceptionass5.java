//D2-Q5
import java.util.Scanner;
public class Exceptionass5
{
	public static void main(String args[])
    {  
     Scanner sc=new Scanner(System.in);   
       try
       {
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c;
        c=a/b;
        System.out.println(c);
       }
       catch(ArithmeticException e)
       {
        System.out.println(e.getMessage());
       }
    
    }
}