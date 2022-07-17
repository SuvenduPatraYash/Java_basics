import java.io.FileInputStream;
class ExceptionDemo3
{
	public static void main(String args[])
	{
       try
       {
        String s=null;
        System.out.println(s.length());
        System.out.println("Hello");
        //FileInputStream f=new FileInputStream("D:/xyz.txt");
       }
       catch(Exception e)
       {
       System.out.println(e);
       }
    System.out.println("Bye");
	}
}