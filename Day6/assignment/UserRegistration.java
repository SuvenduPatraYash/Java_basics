//D2-Q7
class InvalidCountryException  extends Exception  
{  
    public InvalidCountryException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
 
}

public class UserRegistration  
{  
	 public void registerUser(String username, String userCountry) throws InvalidCountryException 
	 {
		if (!userCountry.equals("India"))
		{
            System.out.println("Invalid Country");
		}
		else
		{
			System.out.println("User registration done successfully");
		}
		

     }
	
	public static void main(String[] args) 
	{
		
		UserRegistration registration = new UserRegistration();
		
		try 
		{
			registration.registerUser("Mickey", "Mexico");
			registration.registerUser("Mini", "India");
		} 
		catch (InvalidCountryException e) 
		{
			System.out.println(e);
		}
	}

}