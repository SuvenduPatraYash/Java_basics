package day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a8_q1 
{

	public static void main(String[] args) 
	{
        Map<String, String> map = new HashMap<>();
		
		map.put("vegetable", "potato");
		map.put("fruit", "apple");
		map.put("fungus", "mushroom");
		
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		//a)key exists or not?
		while (it.hasNext())
		{
			Map.Entry<String, String> me = it.next();
			
			if (me.getKey().equals("fruit"))
			{
				System.out.println("The Key: fruit exists");
				break;
			}
		}
		
		
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext())
		{
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals("mushroom")) 
			{
				System.out.println("The Value: Mushroom exists");
				break;
			}
		}
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) 
		{
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
			
		}

	}

}
