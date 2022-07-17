//Blob Insertion
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcBlobInsert 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
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
			
			String q="insert into employee(Name,image) values(?,?)";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setString(1, "road");
			FileInputStream f=new FileInputStream("d:\\road.jfif");
			ps.setBinaryStream(2,f);
			ps.execute();
			System.out.println("Inserted image successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		


	}

}
