public class ThreadDemo1 implements Runnable{
     public void run()
	  {
	      System.out.println("Thread Started");
		  }
		  public static void main(String[] args){
		  Thread t=new Thread(new ThreadDemo1());
		  t.start();
		  }
	}