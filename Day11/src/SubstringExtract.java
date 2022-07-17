import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringExtract 
{

	public static void main(String[] args) 
	{
		String strdata;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		strdata=sc.nextLine();
		Pattern pattern = Pattern.compile(".*'([^']*)'.*");
		Matcher matcher = pattern.matcher(strdata);
		if (matcher.find())
		{
		    System.out.println(matcher.group(1));
		}

	}

}
