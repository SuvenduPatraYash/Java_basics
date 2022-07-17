import java.io.*;
class BufferConsoleDemo
{
	public static void main(String[] args) throws Exception
	{
	 InputStreamReader i = new InputStreamReader(System.in);
	 BufferedReader b = new BufferedReader(i);
	 String name=b.readLine();
	 System.out.println("After reading by bufferedreader: "+name);
	}
}