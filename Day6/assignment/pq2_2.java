import java.util.Scanner;
public class pq2_2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n number:");
	    int num = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= num; ++i)
        {
            fact = fact * i;
        }
        System.out.printf("Factorial of %d = %d", num, fact);
	 
	}
}