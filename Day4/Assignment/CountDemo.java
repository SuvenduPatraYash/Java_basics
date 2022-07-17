//q.1
/*import java.io.FileInputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;*/
import java.io.*;

public class CountDemo 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:/Users/dell/Desktop/YASH Technology/Day4/yash.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		int wordCount = 0;
		int characterCount = 0;
		int whiteSpaceCount = 0;
		

		while ((line = bufferedReader.readLine()) != null) 
		{
			
				characterCount += line.length();
				String words[] = line.split("\\s+");
				wordCount += words.length;
				whiteSpaceCount += wordCount - 1;
				
		}
		
		System.out.println("Total word count = "+ wordCount);
		System.out.println("Total number of characters = "+ characterCount);
		System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
	}
}
