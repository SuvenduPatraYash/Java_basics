package day9;

class ThreadJoinDemo extends Thread
{
	try
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Run Thread"+i);
			Thread.sleep(1000);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}


	public static void main(String[] args) throws Exception
	{
		ThreadJoinDemo tj=new ThreadJoinDemo();
		tj.start();
		tj.join();
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Main Thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
}
}

