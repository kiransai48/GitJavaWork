package ebox1;

import java.util.List;

public interface Export {
	public String exportJSON(List<TicketBooking> bookings);
	public String exportCSV(List<TicketBooking> bookings);
}
