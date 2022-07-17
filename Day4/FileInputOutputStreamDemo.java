import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class FileInputOutputStreamDemo
{
	public static void main(String args[]) throws IOException
	{   
		FileInputStream in=null;
		FileOutputStream out=null;
		try
		{
		in=new FileInputStream("C:/Users/dell/Desktop/YASH Technology/Day4/abc.txt");
		out=new FileOutputStream("C:/Users/dell/Desktop/YASH Technology/Day4/xyz.txt");
		int c;
		
		while((c=in.read())!=-1)
			{
				out.write(c);
				System.out.println((char)c);
			}
		
		}
		finally
		{
			if(in!=null)
			{
               in.close();
			}
			if(out!=null)
			{
               out.close();
			}
		}
				
     }
}