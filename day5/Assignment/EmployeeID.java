//Q1
import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	
	String empName;
	String dep;
	String design;
	double salary;
	
	public String getName()
	{
       return empName;
	}
	public String getDepartment()
	{
		return dep;
	}
	public String getDesignation()
	{
		return design;
	}
	public double getSalary()
	{
		return salary;
	}
public void setName(String empName,String dep,String design,double salary)
{
	this.empName=empName;
	this.dep=dep;
	this.design=design;
	this.salary=salary;
}
public String toString()
{
	return empName+" of "+dep+" department having a role of  "+design+" gets Rupees: "+salary+" only.";
}	
}	

class EmployeeID
{
	public static void main(String args[]) throws IOException
    {

    Employee e=new Employee();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Employee Name");
    e.empName=sc.nextLine();
    System.out.println("Enter the Department");
    e.dep=sc.nextLine();
    System.out.println("Enter the Designation");
    e.design=sc.nextLine();
    System.out.println("Enter the salary");
    e.salary=sc.nextDouble();
    System.out.println(e);
    

	File f=new File("C:/Users/dell/Desktop/YASH Technology/day5/yash2.txt");
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
	oos.writeObject(e);
	oos.close();
    
    }
	
}
