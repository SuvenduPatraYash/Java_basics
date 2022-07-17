class Outer
{
	static class Inner
	{
	void show()
	{
	System.out.println("OUTER SHOW ");
	}
	}
}
public class OuterDemos
{
	public static void main(String args[])
	{
	//Outer o=new Outer();
	Outer.Inner oi=new Outer.Inner();
	oi.show();
	}
}