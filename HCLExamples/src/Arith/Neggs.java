package Arith;

import java.util.Scanner;

public class Neggs {

	public static void main(String[] args) {
	       
        int eggs;        
        int gross;                           
        int dozens;      
        int extras;      
                   
        Scanner sc=new Scanner(System.in);
        System.out.println("How many eggs do you have?  ");
        eggs =sc.nextInt();
        gross = eggs*144;

        System.out.println(" How many dozens you have ");
        dozens = sc.nextInt();
        dozens=dozens*12;
        
        
        System.out.println(" How many extras you have ");
        extras = sc.nextInt();
         
        System.out.println("Your number of eggs is ");
        System.out.println(gross);
        System.out.println(" gross, ");
        System.out.println(dozens);
        System.out.println(" dozen, and ");
        System.out.println(extras);
        System.out.println();
     
     }  

  } 


