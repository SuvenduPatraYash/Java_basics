//Q1
import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	
	String empName;
	String dep;
	String design;
	double salary;
	
Employee(String empName,String dep,String design,double salary)
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
class EmployeeID2
{
	public static void main(String args[]) throws IOException
    {

    Employee e=new Employee("Suvendu Patra","CSE","Associate trainee",100000.00);
    System.out.println(e);
    

	File f=new File("C:/Users/dell/Desktop/YASH Technology/day5/yash2.txt");
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
	oos.writeObject(e);
	oos.close();
    
    }
	
}
