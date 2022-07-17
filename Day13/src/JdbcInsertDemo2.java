import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertDemo2 
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
			String q="insert into employee(empID, name) values(?,?)";
			PreparedStatement ps=con.prepareStatement(q);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Emp Id:");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter name:");
			String name=br.readLine();
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.executeUpdate();
			System.out.println("Inserted successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
