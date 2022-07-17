import java.util.Scanner;

public class PrimeRegex 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		String lengthN=new String(new char[n]);
		boolean isNotPrimeN =lengthN.matches(".?|(..+?)\\1+");
		if(isNotPrimeN!=false)
		{
			System.out.println("Is not prime !!");
		}
		else
		{
			System.out.println("It is prime !!");
		}

	}

}
