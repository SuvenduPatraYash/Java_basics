public class ThreadDemo3 extends Thread{
       public void run()
	   {
	      System.out.println("Thread Started");
		  }
		  public static void main(String[] args)
		  {
		     ThreadDemo3 td = new ThreadDemo3();
			 td.start();
			 ThreadDemo3 td1 = new ThreadDemo3();
			 td1.start();
			 ThreadDemo3 td2 = new ThreadDemo3();
			 td2.start();
			 }
	}