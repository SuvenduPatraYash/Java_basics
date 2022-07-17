import java.io.*;
class Employee implements Serializable
{
	int empId;
	String empName;
	Employee(int empId,String empName)
	{
      this.empId=empId;
      this.empName=empName;
	}
	public String toString()
	{
	return empId + " " +empName;
	}
}
class EmployeeObjectDemo
{
	public static void main(String args[]) throws IOException
	{
	File f=new File("C:/Users/dell/Desktop/YASH Technology/day5/yash1.txt");
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
	Employee e=(Employee)ois.readObject();
	ois.close();
	System.out.println(e);

	}
}