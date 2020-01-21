import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws NumberFormatException, ParseException {
        
    	Scanner scan= new Scanner(System.in);
		List<TicketBooking> Li= new ArrayList<TicketBooking>();
		System.out.println("Enter the number of bookings:");
		int n= Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of booking "+(i+1));
			String data= scan.nextLine();
			String ar[]= data.split(","); 
			TicketBooking tb= new TicketBooking(ar[0],(new SimpleDateFormat("dd-MM-yyyy").parse(ar[1])),ar[2],Double.parseDouble(ar[3]));
			Li.add(tb);
		}
		System.out.println("Sorted Order:");
		Collections.sort(Li,new PriceAndBookingTimeComparator());
		System.out.printf("%-15s%-15s%-15s%-15s\n","Event name","Booking Time","Seat number","Price");
		for (TicketBooking ticketBooking : Li) {
			System.out.println(ticketBooking);
		}

	}
}