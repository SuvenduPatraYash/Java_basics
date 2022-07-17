class ExceptionDemo5
{
	public static void main(String args[])
	{
       try
       {
        int a=100,b=0,c;
        c=a/b;
        System.out.println(c);
       }
       /*catch(ArithmeticException e)
       {
        System.out.println(e.getMessage());
       }*/
       finally
       {
        System.out.println("Hello and Bye!!");
       }
    
	}
}