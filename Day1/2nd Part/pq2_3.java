import java.util.Scanner;
public class pq2_3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n number:");
	    int num = sc.nextInt();
        long fact = findfactorial(num);
        System.out.println("Factorial of " + num + " = " + fact);
    }
    public static long findfactorial(int num)
    {
        if (num >= 1)
            return num * findfactorial(num - 1);
        else
            return 1;
    }
	 
}
