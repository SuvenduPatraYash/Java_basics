import java.io.FileInputStream;
import java.io.FileNotFoundException;
class throwsD
{
	void show() throws FileNotFoundException
	{
	FileInputStream f=new FileinputStream("d:/yash.txt");
	}
}
class ThrowsDemo
{
	public static void main(String[] args)
	{
		ThrowsD t=new ThrowsD();
		try
		{
			t.show();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("It is normal termination");
	}
}