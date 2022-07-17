import java.util.Scanner;
class pq5
{
	public static void main(String[] args) 
	{
	int x;
  int y;
  int temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of x and y: ");
  x=sc.nextInt();
  y=sc.nextInt();
  System.out.println("Before Swapping\n x="+x+"\n y = "+y);
  temp=x;
  x=y;
  y=temp;
  System.out.println("After Swapping\n x="+x+"\n y = "+y);  
}
}