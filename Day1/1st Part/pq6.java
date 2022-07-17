import java.util.Scanner;
class pq6
{
public static void main(String[] args) 
{
  int x;
  int y;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of x and y: ");
  x=sc.nextInt();
  y=sc.nextInt();
  System.out.println("Before Swapping\n x="+x+"\n y = "+y);
  x=x+y;
  y=x-y;
  x=x-y;
  System.out.println("After Swapping\n x="+x+"\n y = "+y);  
}
}