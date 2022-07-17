import java.io.Console;
class ConsoleDemo
{
	public static void main(String[] args)
	{
	String str;
	char ch[];
	Console ob=System.console();
	System.out.print("Enter Username:  ");
	str=ob.readLine();
	System.out.print("Enter password:  ");
	ch=ob.readPassword();
	String a=String.valueOf(ch);
	System.out.println("Username:  "+str+"  password  :"+ch);
	System.out.println("Actual Password: " + a);
	}
}