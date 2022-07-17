package day10;
class Revenue extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this) 
		{
			for(int i=1;i<=5;i++)
			{
				total=total+400;
			}
			this.notify();
		}
	}
}
public class ThreadInterProcessDemo 
{

	public static void main(String[] args) 
	{
	Revenue r=new Revenue();
	r.start();
	synchronized(r)
	}

}
