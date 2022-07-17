package day10;
public class ThreadGetState extends Thread 
{  
   public void run()   
    {  
         
        Thread.State state = Thread.currentThread().getState();  
        System.out.println("Running thread name: "+ Thread.currentThread().getName());  
        System.out.println("State of thread: " + state);  
    }  
    public static void main(String args[])   
    {  
        ThreadGetState t1 = new ThreadGetState();  
		ThreadGetState t2 = new ThreadGetState();
        
        t1.start();     
        t2.start();  
    }  
}  
