package day10;

public class ThreadInterruptDemo 
{    
	public void run()
	{
		try 
		{
			for(int i=0;i<=3;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
	public static void main(String[] args) 
	{
		ThreadInterruptDemo ti=new ThreadInterruptDemo();
		ti.start();
		ti.interrupt();
	}

}
