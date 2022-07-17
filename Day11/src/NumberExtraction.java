import java.util.Scanner;

public class NumberExtraction 
{

	public static void main(String[] args) 
	{
		String str, strNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string which has numbers: ");
		str=sc.nextLine();
		
		strNumber=str.replaceAll("[^0-9]","");
		System.out.println("Extracted numbers are: "+strNumber);
		
		

	}

}
