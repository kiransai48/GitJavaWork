package Examples;
import java.util.*;
import java.text.*;
public class Calendar {
   public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     
     int dd=1;
     int month=0;
 
     int year=input.nextInt();
   Date date= (new GregorianCalendar(year, month, dd)).getTime();
   SimpleDateFormat f = new SimpleDateFormat("EEEE");
     String day=f.format(date);
     System.out.println(day);
     }
}

