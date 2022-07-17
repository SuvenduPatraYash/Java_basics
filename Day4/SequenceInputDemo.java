import java.io.*;
class SequenceInputDemo
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream f1=new FileInputStream("C:/Users/dell/Desktop/YASH Technology/Day4/abc.txt");
		FileInputStream f2=new FileInputStream("C:/Users/dell/Desktop/YASH Technology/Day4/xyz.txt");
		SequenceInputStream st=new SequenceInputStream(f1,f2);
		int i;
		while((i=st.read())!=-1)
		{
			System.out.println((char)i);			
		}
		st.close();
		f1.close();
		f2.close();
	}
}
