public class ThreadDemo2 extends Thread{
       public void run()
	   {
	      System.out.println("Thread Started");
		  }
		  public static void main(String[] args)
		  {
		     ThreadDemo2 td = new ThreadDemo2();
			 td.start();
			 }
	}