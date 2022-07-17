package day10;
/*class BookTicket
{
	int totalseats=12;
	void bookSeat(int seats)
	{
		if(totalseats>=seats)
		{
			System.out.println("Book Sucessfully");
			totalseats=totalseats-seats;
			System.out.println("Remaining seats: "+totalseats);
		}
		else 
		{
		System.out.println("seats not available: "+totalseats);	
		}
	}
}*/
public class TicketWithNoSynchro extends Thread
{
    static BookTicket b;
    int seats;
    public void run()
    {
    	b.bookSeat(seats);
    }
	public static void main(String[] args)
	{
		b=new BookTicket();
		TicketWithNoSynchro p1=new TicketWithNoSynchro();
		p1.seats=8;
		p1.start();
		TicketWithNoSynchro p2=new TicketWithNoSynchro();
		p2.seats=8;
		p2.start();
		
		
		
		}

}
