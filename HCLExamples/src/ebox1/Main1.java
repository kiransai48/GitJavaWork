package ebox1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		String uName= sc.next();
		System.out.println("Enter Password :");
		String pswd= sc.next();	
		Customer c= new Customer(uName,pswd);	
		if(pswd.length()>5)
		{
			//System.out.println(sb.charAt(4));
			if((pswd.charAt(4)=='a' || pswd.charAt(4)=='e'||pswd.charAt(4)=='i' ||pswd.charAt(4)=='o'||pswd.charAt(4)=='u'))
			{
				System.out.println("Strong password");
			}
			else
				System.out.println("Weak password");
		}
		else
			System.out.println("Weak password");
	}
}
