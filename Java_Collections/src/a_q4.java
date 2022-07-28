import java.util.Iterator;
import java.util.Vector;

class Employee 
{
	private int id;
	private String name;
	private String state;
	private String city;
	private Double salary;
	
	public Employee(int id, String name, String state, String city, Double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.city = city;
		this.salary = salary;
	}	
	
	public int getId() 
	{
		return id;
	}

	@Override
	public String toString() 
	{
		return "Employee Info: [Employee Id=" + id + ", Name=" + name + ", City= " + city +" State = "+ state +", salary=" + salary + "]";
	}
}

public class a_q4 
{

	public static void main(String[] args) 
	{
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(10, "Suvendu", "Odisha, India","Bhubaneswar", 26000.0));
		list.add(new Employee(20, "Swastik", "Andhra Pradesh, India","Vizag" ,30000.0));
		list.add(new Employee(30, "Shivam", "Goa, India","panjim", 50000.0));
		list.add(new Employee(40, "Somiya", "Madhya Pradesh, India","indore", 78000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}