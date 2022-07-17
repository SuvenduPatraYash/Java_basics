package day10;
class BookTicket
{
	int totalseats=12;
	synchronized void bookSeat(int seats)
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
}
public class TicketWithSynchro extends Thread
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
		TicketWithSynchro p1=new TicketWithSynchro();
		p1.seats=8;
		p1.start();
		TicketWithSynchro p2=new TicketWithSynchro();
		p2.seats=8;
		p2.start();
	}

}

