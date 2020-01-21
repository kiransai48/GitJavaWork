package ebox;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
  
  Scanner s= new Scanner(System.in);
  System.out.println("Enter the Cricket Format\r\n1.ODI\r\n2.T20\r\n3.Test");
  int n= Integer.parseInt(s.nextLine());
  if(n==1)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(s.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(s.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(s.nextLine());
   Match odi= new ODI(score, currentOver, target);
   System.out.println("Requirements:");
   odi.display();
  }
  else if(n==2)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(s.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(s.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(s.nextLine());
   Match t20= new T20(score, currentOver, target);
   
   System.out.println("Requirements:");
   t20.display();
  }
  else if(n==3)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(s.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(s.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(s.nextLine());
   Match test= new Test(score, currentOver, target);
   System.out.println("Requirements:");
   test.display();
  }
  else
  {
   System.out.println("Invalid Format type");
  }
 }
}
