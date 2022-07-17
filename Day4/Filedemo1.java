import java.io.File;
class Filedemo1
{
  public static void main(String args[]) //throws IOException
  {
  File f=new File("C:/Users/dell/Desktop/YASH Technology/Day4/abc.txt");
  System.out.println(f.exists());
  System.out.println(f.canWrite());
  System.out.println(f.getName());
  System.out.println(f.length());
  

  }	
}