package ebox1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main16 {
	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();  
		  Scanner scan=new Scanner(System.in);
		  int num,num1,count;
		  System.out.println("Enter the number of passengers in the list:");
		  num=scan.nextInt();
		  System.out.println("Enter the passengers names:");
		  for(int i=0;i<num;i++)
		        {
		         al.add(scan.next());      
		        }
		  System.out.println("Enter the number of passengers who have not arrived to the airport on time");
		  num1=scan.nextInt();
		  System.out.println("Enter the passenger who are not arrived airport on time:");
		  for(int i=0;i<num1;i++)
		        {
		       al.add(scan.next());       
		        } 
		  System.out.println("New passengers list:");
		 HashSet<String>hasUnique = new HashSet<String>(al);
		       List<String>list = new ArrayList<String>(hasUnique);
		       Collections.sort(list);
		      for(String g:list)
		      {   
		        count=Collections.frequency(al,g);
		       if(count==1)
		       {
		       System.out.println(g);
		       }
		 }
		 }
}
