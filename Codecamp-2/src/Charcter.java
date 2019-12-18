
import java.util.Scanner;
public class Charcter 
{
public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String string=sc.next();
		int length=string.length();
		if(length%2!=0)
		{
		 char p= (char) string.codePointAt(length/2);
		 System.out.println("The middle character is "+p);	
		}
		else
		{
			char p1=  (char) string.codePointAt((length/2)-1);
			char p2=  (char) string.codePointAt(length/2);
			System.out.println("The middle characters are "+p1+" "+p2);
		}
	}

}
