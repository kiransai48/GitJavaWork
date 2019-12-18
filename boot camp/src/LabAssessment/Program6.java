package LabAssessment;
import java.util.Scanner;
public class Program6 {

		
	public static void main(String [] args)
	{
		String name,address,email;
		Scanner c=new Scanner (System.in);
		
		System.out.println("Enter the full name:");
		name=c.nextLine();
		System.out.println("Enter thr address: ");
		address=c.nextLine();
		System.out.println("Enter the email Id :");
		email=c.nextLine();
		if(name.isEmpty())
		{
			System.out.println("Insufficent Data");
		}
		else if(address.isEmpty()) {
			System.out.println("Insufficent Data");
		}
		else if(email.isEmpty())
		{
			System.out.println("Insufficent Data");
					}
		
		else
		{
			System.out.println("Name: " +name+ "  Address: " +address+ "  Email: "+email);
		}
	}
		
			}


