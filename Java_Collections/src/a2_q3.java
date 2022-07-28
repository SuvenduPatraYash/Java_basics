import java.util.Iterator;
import java.util.TreeSet;

public class a2_q3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Suvendu");
		set.add("Swastik");
		set.add("Richa");
		set.add("Rajas");
		
		Iterator<String> it = set.iterator();
		String query = "Swastik";
		boolean result = false;
		
		while (it.hasNext()) 
		{
			if (it.next().equals(query)) 
			{
				result = true;
				break;
			}
		}
		
		if (result) 
		{
			System.out.println(query + " exists");
		}
		else 
		{
			System.out.println(query + " doesn't exist");
		}

	}

}
