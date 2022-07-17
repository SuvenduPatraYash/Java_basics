public class EnnumDemo2
{
	enum Seasons
	{
    SUMMER(10),WINTER(20),RAINY(30),AUTUM(40),SPRING(50);
    int val;
    Seasons(int val)
    {
       this.val=val;
    }
    }
public static void main(String args[])
{  
	Seasons d=Seasons.WINTER;
	System.out.println(d);
    /*for(Seasons d:Seasons.values())
    {
    System.out.println(d+" "+d.val);
    }*/
	
}
}