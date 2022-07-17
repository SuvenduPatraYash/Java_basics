import java.io.FileInputStream;
import java.io.BufferedInputStream;
class BufferedInputDemo
{
	public static void main(String args[])
	{
	try
		{
		FileInputStream fin=new FileInputStream("C:/Users/dell/Desktop/YASH Technology/Day4/abc.txt");
		BufferedInputStream binput=new BufferedInputStream(fin);
		int i;
		
		while((i=binput.read())!=-1)
			{
				
				System.out.println((char)i);
			}
		binput.close();
		fin.close();	
		}
		catch(Exception e)
		{  
           e.printStackTrace();
		}
	}
}