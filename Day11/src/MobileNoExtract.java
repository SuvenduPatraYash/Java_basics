import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoExtract 
{

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		str=sc.nextLine();
		Pattern pattern = Pattern.compile("\\d{3}\\d{3}\\d{4}");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find())
		{
		    System.out.println("Your Phone number is: "+ matcher.group(0));
		}

	}

}
