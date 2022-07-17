package day8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class ContactList 
{
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) 
	{
		contacts.put(name, number);
	}
	
	public void removeContact(String name) 
	{
		contacts.remove(name);
	}

	@Override
	public String toString() 
	{
		return "ContactList [ contacts = " + contacts + "]";
	}
	
	public boolean ContactNumberExistance(String name)
	{
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) 
		{
			Map.Entry<String, Integer> me = it.next();
			
			if (me.getKey().equals(name)) 
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean ContactNumberExistance(Integer number) 
	{
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) 
		{
			Map.Entry<String, Integer> me = it.next();

			
			if (me.getValue().intValue() == number) 
			{
				
				return true;
			}
		}
		
		return false;
	}
	
	public void listAllContacts() 
	{
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) 
		{
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}

	}
}
public class a8_q3 
{
	public static void main(String[] args) 
	{
		ContactList cl = new ContactList();
		
		cl.addContact("Suvendu", 797807647);
		cl.addContact("Police", 100);
		cl.addContact("Ambulance", 108);
		cl.addContact("oshii", 897605657);
				
		System.out.println("Police: " + cl.ContactNumberExistance("Police"));
		System.out.println("oshii: " + cl.ContactNumberExistance(897605657));
		
		System.out.println();
		cl.listAllContacts();
	}

}
