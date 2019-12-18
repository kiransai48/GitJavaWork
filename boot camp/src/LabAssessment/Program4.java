package LabAssessment;
import java.util.Scanner;
public class Program4 {
	private static Scanner sc;
	public static void main(String [] args)
	{
		String name;
		int units;
		double bill;
		 sc=new Scanner(System.in);
			System.out.println("Enter number of units Consumed:");
			units=sc.nextInt();
			bill=Electricity(units);
		System.out.println("\n Electricity Bill="+bill);
	}
	public static double Electricity(int units)
	{
		double amount,ser_Tax=0.1475, bill,fixed_MeterLength=250;
		if(units==100) {
			amount=units*3.25;
		}
		else if(units==200) {
			amount=units*4.75;
					}
		else 
		{
			amount=units*6.35;
		}
		bill=amount+ser_Tax+fixed_MeterLength;
		return bill;
	}
		
	}
		
