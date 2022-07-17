import java.io.File;
import java.io.FileReader;
import java.io.Filewriter;
import java.io.IOException;
class FileReaderWriter
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("C:/Users/dell/Desktop/YASH Technology/Day4/abc.txt");
		f.createNewFile();
		FileWriter w=new Filewriter(f);
		w.write("Welcome to yash");
		w.close();
		FileReader r=new FileReader(f);
		char[] a=new char[20];
		r.read(a);
		for(char c:a)
		{ 
          System.out.println(c);
		}
		r.close();

	}
}
