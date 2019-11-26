package Examples;

import java.util.Scanner;


public class Cuberootdemo {
	
			private static boolean prime;

			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
			
				double  cubeRoot; double number;
				
				
					System.out.print(" Please Enter only prime Numbers from 1 to 100 : ");
					 number = sc.nextDouble();		
					cubeRoot = Math.cbrt(number);
					System.out.println("\n The cube root of a Given Number =  " +cubeRoot);
				}
				
			}
			
		

