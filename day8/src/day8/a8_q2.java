package day8;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class a8_q2 
{

	public static void main(String[] args) 
	{
        Properties p = new Properties();
		p.setProperty("Odisha ", " Bhubaneswar");
		p.setProperty("Madhya Pradesh ", " Bhopal");
		p.setProperty("Maharastra ", " Mumbai");

		Set<Entry<Object, Object>> set = p.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext())
		{   
			
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}

	}

}
