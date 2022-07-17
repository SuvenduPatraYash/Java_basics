package day9;

public class ThreadPriDemo extends Thread 
{
 public void run()
 {
	 System.out.println("While run method: ");
	 System.out.println(Thread.currentThread().getPriority());
	 
 }
 public static void main(String[] args) 
 {
	 System.out.println(Thread.currentThread().getPriority());
	 Thread.currentThread().setPriority(MIN_PRIORITY);
	 System.out.println(Thread.currentThread().getPriority());
	 ThreadPriDemo tp=new ThreadPriDemo();
	 tp.setPriority(20);
	 tp.start();
	 
}
}
