package day9;

public class ThreadDaemonDemo extends Thread 
{
    public void run()
    {
    	if(Thread.currentThread().isDaemon())
    	{
    		System.out.println("I m in a deamon thread");
    	}
    	else
    	{
    		System.out.println("I am in a non-deamon thread");
    	}
    }
	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		ThreadDaemonDemo td=new ThreadDaemonDemo();
		td.setDaemon(true);
		td.start();

	}

}
