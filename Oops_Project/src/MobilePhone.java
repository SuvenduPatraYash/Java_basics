
public class MobilePhone implements Telephone 
{
    
	private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;
	
    public MobilePhone(String myNumber)
    {
    	this.myNumber = myNumber;
    }

	@Override
	public void powerOn() 
	{
		isPowerOn = true;
		System.out.println("Mobile phone is always powered");
		
	}

	@Override
	public void dial(String phoneNumber)
	{
		System.out.println("Now ringing:"+phoneNumber +"on mobile phone");
		
	}

	@Override
	public void answer() 
	{
		if(isRinging && isPowerOn)
		{
			System.out.println("Answering the mobile phone");
			isRinging=false;
		}
		else
		{
			System.out.println("Phone not ringing");
		}
		
	}

	
	public boolean callPhone(String phoneNumber) 
	{
		if(phoneNumber == myNumber && isPowerOn)
		{
			isRinging=true;
			System.out.println("Phone Ringing..");
		}
		else
		{
		    System.out.println("Wrong number or Phone is Off");
			isRinging=false;
		}
		return false;
	}

	@Override
	public boolean isRinging() 
	{
		
		return isRinging;
	}
}
