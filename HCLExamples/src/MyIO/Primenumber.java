package MyIO;

import java.util.Scanner;

public class Primenumber {
	public static void main(String args[])
	   {		
		int temp;
		int num;
		boolean Prime=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		num=sc.nextInt();
	      
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      Prime=false;
		      break;
		   }
		}
	
		if(Prime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
}
