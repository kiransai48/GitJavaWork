import java.util.Comparator;
public class PriceAndBookingTimeComparator implements Comparator<TicketBooking> {

    @Override
    public int compare(TicketBooking booking1, TicketBooking booking2) {
    	if(booking1.getPrice()>booking2.getPrice())
		 return 1;
		else if(booking1.getPrice()<booking2.getPrice())
	     return -1;
		else
		return (booking1.getBookingTime().compareTo(booking2.getBookingTime()));
			
	}

	
}