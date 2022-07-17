//Q1
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class ParentTest {
   String parentName;
   ParentTest(String n1){
      parentName = n1;
   }
   public void display() {
      System.out.println(parentName);
   }
}
class ChildTest extends ParentTest {
   String childName;
   ChildTest(String n2) {
      super(n2);
      childName = n2;
   }
   public void display() {
      System.out.println(childName);
   }
} 
class UncheckedExceptionDemo
{
   public static void main(String args[])
	{
       
      try
       {
      
        System.out.println(85/0);
       }
       catch(Exception e)
       {
       System.out.println(e);
       }
       System.out.println("This is 1st Unchecked Exception.");
       
      try
       {
         Object ref = null;
         ref.toString(); 
       }
       catch(NullPointerException h)
       {
       System.out.println(h);
       }
       System.out.println("This is 2nd Unchecked Exception.");
       
       
       try
       { 
         int ar[] = { 1, 2, 3, 4, 5 };
         for (int i = 0; i <= ar.length; i++)
         {
              System.out.print(ar[i]+" ");
         }
       }
       catch(Exception i)
       {
       System.out.println(i);
       }
       System.out.println("This is 3rd Unchecked Exception.");

       try
       { 
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter value of a to get its square value:(Enter float values to get exception)");  
         Integer a = sc.nextInt();     
         System.out.println((a*a)); 
       }
       catch(InputMismatchException j)
       {
       System.out.println(j);
       }
       System.out.println("This is 4th Unchecked Exception.");

       try
       { 
      ChildTest ct1 = new ChildTest("Suvendu");
      ParentTest pt1 = new ParentTest("GCP");
      pt1 = ct1;
      pt1.display();

      ParentTest pt2 = new ParentTest("YASH");
      ChildTest ct2 = (ChildTest)pt2;  
       }
       catch(Exception k)
       {
       System.out.println(k);
       }
       System.out.println("This is 5th Unchecked Exception.");

     }  
}