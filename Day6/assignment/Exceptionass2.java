//D2-Q1
import java.util.Scanner;
public class Exceptionass2
{
	public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. of element to be stored ");
       int len = sc.nextInt(); 

       int[] arr = new int[len];
       System.out.println("Enter the elements in array ");
       try 
       {
            for (int i=0;i<len;i++)
               arr[i] = sc.nextInt();
        
            System.out.println("Enter the index of the array element you want to access");

            int ind = sc.nextInt();
            System.out.println("The array element at index " + ind + " = " + arr[ind]);
            System.out.println("The array element successfully accessed");
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        } 

    
	}
}