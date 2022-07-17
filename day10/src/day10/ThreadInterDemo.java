package day10;

public class ThreadInterDemo extends Thread
{
	public void run()
	{
		//System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		    System.out.println(e);	
		}
		
	}

	public static void main(String[] args) 
	{
		ThreadInterDemo tid=new ThreadInterDemo();
		tid.start();
		tid.interrupt();
	}

}
