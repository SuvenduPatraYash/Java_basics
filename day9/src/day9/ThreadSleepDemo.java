package day9;

public class ThreadSleepDemo extends Thread 
{    
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try
			{
				Thread.sleep(-1);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		ThreadSleepDemo ts=new ThreadSleepDemo();
		ts.start();
		

	}

}
