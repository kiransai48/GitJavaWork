import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws NumberFormatException {
Scanner scan= new Scanner(System.in);
List<Integer> noOfEvents= new ArrayList<Integer>();
System.out.println("Enter the number of halls:");
int n= Integer.parseInt(scan.nextLine());
System.out.println("Enter the hall details in comma separated(Name,Cost per day,Event Type-1,Event Type-2,.....,Event Type-n)");
EventType et= new EventType();
Hall h= new Hall();
for(int i=0;i<n;i++)
{
String s= scan.nextLine();
String a[]= s.split(",");
Hall h1= new Hall(a[0],Integer.parseInt(a[1]));
et.addToHallList(h1);
h.addToHallList(h1);
h.addToNoOfEvents(a.length-2);
for(int j=2;j<a.length;j++)
{
EventType e= new EventType(a[j]);
h.addToEventTypeList(e);
}
}
System.out.println("Enter the event name to get the halls:");
String event= scan.nextLine();
System.out.println("Event Name:"+event);
System.out.println("Halls:");
h.checkEvent(event);
}
}