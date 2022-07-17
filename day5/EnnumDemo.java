public class EnnumDemo
{
	enum Directions
	{
    EAST(10),WEST(20),NORTH(30),SOUTH(40);
    int val;
    Directions(int val)
    {
       this.val=val;
    }
    }
public static void main(String args[])
{  
	//Directions d=Directions.EAST;
	//Syetem.out.println(d);
    for(Directions d:Directions.values())
    {
    System.out.println(d+" "+d.val);
    }
	
}
}