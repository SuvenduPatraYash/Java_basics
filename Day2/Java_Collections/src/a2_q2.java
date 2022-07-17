import java.util.HashSet;
import java.util.Iterator;

public class a2_q2 {

	public static void main(String[] args) 
	{
        HashSet<String> set = new HashSet<>();
		
		set.add("Suvendu");
		set.add("Swastik");
		set.add("Richa");
		set.add("Rajas");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
