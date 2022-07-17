class MyThread1 extends Thread
{
    public void run()
	{
	   System.out.println("I am in mythread1");
	   }
	}
class MyThread2 extends Thread
{
    public void run()
	{
	   System.out.println("I am in mythread2");
	   }
	}
class MyThread3 extends Thread
{
    public void run()
	{
	   System.out.println("I am in mythread3");
	   }
	}
class MyThread4 extends Thread
{
    public void run()
	{
	   System.out.println("I am in mythread4");
	   }
	}
public class ThreadDemoMulti{
      public static void main(String[] args){
	  MyThread1 t1=new MyThread1();
	  t1.start();
	  MyThread2 t2=new MyThread2();
	  t2.start();
	  MyThread3 t3=new MyThread3();
	  t3.start();
	  MyThread4 t4=new MyThread4();
	  t4.start();
	  }
}