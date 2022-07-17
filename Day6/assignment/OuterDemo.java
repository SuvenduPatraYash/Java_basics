class Outer
{
	class Inner
	{
	void show()
	{
	System.out.println("OUTER SHOW ");
	}
	}
}
public class OuterDemo
{
	public static void main(String args[])
	{
	Outer o=new Outer();
	Outer.Inner oi=o.new Inner();
	oi.show();
	}
}