import java.util.Scanner;
public class pq2_4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n number:");
	    int num = sc.nextInt();
        int rev=0;
        System.out.println("Original Number: " + num);

    while(num != 0) {
    
      
      int digit = num % 10;
      rev = rev * 10 + digit;

      
      num /= 10;
    }

    System.out.println("Reversed Number: " + rev);
  }
}
	 

