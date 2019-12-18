import java.util.Scanner;
public class Year {
 public static void main(String args[])
		   {
		       int q,q1,q2, year,week, month, day;
		       Scanner sc = new Scanner(System.in);
		       System.out.print("Enter the number of days:");
		       q = sc.nextInt();
		       year = q / 365;
		       q1 = q % 365;
		       System.out.println("Number of years:"+year);
		       week=q/7;
		       month = q / 30;
		       System.out.println("Number of month:"+month);
		       q2=week&7;
		       day=q;
		       System.out.println("Number of days:"+day);
		   }
	}


