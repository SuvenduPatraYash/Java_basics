import java.util.Scanner;

public class EmailValidation 
{

	public static void main(String[] args) 
	{ 
		  
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Enter your website name: ");
			      String str2 = sc.next();
			      String regex = "[(http(s)?):\\/\\/(www\\.)?a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)";
			      boolean result = str2.matches(regex);
			      if(result) 
			      {
			         System.out.println("This website is valid");
			      } 
			      else 
			      {
			         System.out.println("This website is not valid");
			      }
		

	}

}
