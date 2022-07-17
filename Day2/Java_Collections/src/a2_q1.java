import java.util.HashSet;
import java.util.Iterator;

class Country 
{
	HashSet<String> h1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) 
	{
		h1.add(CountryName);
		return h1;
	}
	
	public String getCountry(String CountryName) 
	{
		Iterator<String> it = h1.iterator();
		
		while (it.hasNext()) 
		{
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}
public class a2_q1 
{

	public static void main(String[] args) 
	{
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Indonesia");
		countries.saveCountryNames("China");
		countries.saveCountryNames("Japan");
		

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Spain: " + countries.getCountry("Spain"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}


}


