package oop;

import java.util.Scanner;

/**
 * @author TSSVJA
 *
 */
public class Account {
public static void main (String args[])
{
Long AccountNumber;
String Accounttype;
float balance;
String username;
String IFSCcode;

Scanner sc=new Scanner(System.in);
System.out.println("Enter 11 digit Acc Number");
AccountNumber=sc.nextLong();

System.out.println("Enter Acc type ");

Accounttype =sc.next();

System.out.println("Enter the balance");
balance=sc.nextFloat();

System.out.println("Enter username");

username =sc.next();


System.out.println("Enter the IFSCcode");

IFSCcode=sc.next();

System.out.println("\n Account number is:"+AccountNumber+"\n Account type is:"+Accounttype+"\n Balance is:"+balance+"\n username is:"+username+"\n IFSC code is:"+IFSCcode+" ");

}


}  


