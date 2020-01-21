import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws NumberFormatException, ParseException {
		
		Scanner sc= new Scanner(System.in);
		Map<String,Integer> m= new HashMap<String,Integer>();
		Map<Date,Map<String,Integer>> m1= new HashMap<Date,Map<String,Integer>>();
		
		System.out.println("Enter number of show times");
		int n= Integer.parseInt(sc.nextLine());
		System.out.println("Enter details of showtimes in CSV(Show Date(dd/MM/yyyy),Show Time Interval(Eg:1PM-4PM),Tickets Booked)");
		for(int i=0;i<n;i++)
		{
			String details= sc.nextLine();
			String det[]= details.split(",");
			
			m.put(det[1],Integer.parseInt(det[2]));
			m1.put(new SimpleDateFormat("dd/MM/yyyy").parse(det[0]),m);
		}
		System.out.println("Enter a show details to find tickets booked in CSV(Show Date(dd/MM/yyyy),Show Time Interval(Eg:1PM-4PM))");
		String search=sc.nextLine();
		String details[]= search.split(",");
		if(m1.containsKey(new SimpleDateFormat("dd/MM/yyyy").parse(details[0])))
		{
			if(m.containsKey(details[1]))
			{
				System.out.println("Tickets Booked = "+m.get(details[1]));
			}
			else
			{
				System.out.println("No show in a particular time");
			}
			
		}
		else
		{
			System.out.println("No show in a particular time");
		}

	}

}