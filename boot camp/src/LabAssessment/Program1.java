package LabAssessment;
import java.util.Scanner;
public class Program1 {
public static void main(String [] args)
{
		int n,a=0,b=3;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of elements: ");
	
	n=s.nextInt();
	for(int i=0;i<n;i++)
	{
				System.out.print(" "+a);
				a=a+b;
				b=b+2;
				
	}
}



}
