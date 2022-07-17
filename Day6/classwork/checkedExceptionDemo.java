//Q2
import java.io.FileInputStream;
//import java.lang.*;
import java.util.*;
abstract class Inst
{

}
class checkedExceptionDemo
{
	public static void main(String args[]) throws InstantiationException,IllegalAccessException,ClassNotFoundException
	{
       try
       {
        FileInputStream f=new FileInputStream("C:/Users/dell/Desktop/YASH Technology/Day6/yash3.txt");
       }
       catch(Exception e)
       {
       System.out.println(e);
       }
      System.out.println("This is 1st Checked Exception.");
	  
       try 
       {
         Class.forName("mypacakage.yash");
        }
        catch(ClassNotFoundException h) 
         {
        System.out.println(h); 
        }
       System.out.println("This is 2nd Checked Exception.");
       try
       {
       Class cl=Class.forName("Inst");
       cl.newInstance();
        } 
       catch(Exception t)
       {
        System.out.println(t);
        System.out.println("This is 3rd Checked Exceptions");
       } 
       
   }
}