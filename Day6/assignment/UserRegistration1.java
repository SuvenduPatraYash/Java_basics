	class MyException extends Exception{


	public void registerUser(String username, String userCountry) throw InvalidCountryException 
	{
		if (userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}}

public class UserRegistration1 {

	public static void main(String[] args) 
	{
		
		UserRegistration registration = new UserRegistration();
		
		try 
		{
			//registration.registerUser("Mickey", "Mexico");
			registration.registerUser("Mini", "India");
		} 
		catch (InvalidCountryException e) 
		{
			//System.out.println(e);
		}
	}

}