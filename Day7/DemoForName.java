class A
{

}
interface b
{

}
	
class DemoForName
{
	public static void main(String args[]) throws Exception
	{
		//class c=Class.forName("");
		//System.out.println(c.getName());
		Class c=Class.forName("A");
		System.out.println(c.isInterface());
		Class c=Class.forName("b");
		System.out.println(c.isInterface());


		
		
	}
}
