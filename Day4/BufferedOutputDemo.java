import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
class BufferedOutputDemo
{
	public static void main(String args[])
	{
	try
		{
		FileOutputStream fout=new FileOutputStream("C:/Users/dell/Desktop/YASH Technology/Day4/abc.txt");
		BufferedOutputStream boutput=new BufferedOutputStream(fout);
		int i;
		
		while((i=boutput.read())!=-1)
			{
				
				System.out.println((char)i);
			}
		boutput.close();
		fout.close();	
		}
		catch(Exception e)
		{  
           e.printStackTrace();
		}
	}
}