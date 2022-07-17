import java.util.Scanner;
class pq3
{
	public static void main(String[] args) 
	{
	 
	 System.out.print("Enter a Year: ");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 if(n%400==0)
	 {
	 	System.out.print("It is a leap Year !! ");
	 }
	 else if(n%100==0)
	 {
	 	System.out.print("It is not a leap Year !! ");
	 }
	 else if(n%4==0)
	 {
	 	System.out.print("It is a leap Year !! ");
	 }
	 else
	 {
	 	System.out.print("It is not a leap Year !! ");
	 }
	}
}