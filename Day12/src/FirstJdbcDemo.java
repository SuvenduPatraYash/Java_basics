import java.sql.*;
public class FirstJdbcDemo 
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
			String q="select * from employee";
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(q);
			while(set.next())
			{
				int id=set.getInt("empID");
				String name=set.getString("name");
				System.out.println("EMP id: "+id);
				System.out.println("name: "+name);
			}
			con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
