import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcClobInsert 
{

	public static void main(String[] args) 
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/yash";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			if(con!=null)
			{
				System.out.println("Connection created succesfully");
			}
			else
			{
				System.out.println("Connection not created");
			}
			PreparedStatement ps=con.prepareStatement("insert into FileStore(Name,Article) values(?,?)");
			ps.setString(1, "Suvendu");
			
			
			FileReader in = new FileReader("d://Java.txt");
			/*BufferedReader br=new BufferedReader(in);
			FileInputStream fstream = new FileInputStream("Java.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));*/
			/*File myFile = new File("Java.txt");
			Scanner input = new Scanner(myFile);
	        String in = "";
	        in = input.nextLine();*/
			
			ps.setClob(2,in);
			ps.executeUpdate();
			
			System.out.println("Text inserted......");
			con.close(); 
		}			
			catch(Exception e)
			{
				e.printStackTrace();
			}			
		}

	}

