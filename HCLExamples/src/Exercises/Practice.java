package Exercises;


import java.util.Scanner;
import java.lang.Math;
public class Practice {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int k,i=0,num,n=0,sqr,dig=0,sum=0,sumfinal;
	k=sc.nextInt();
	num=k;
	sqr=num*num;
	while(k!=0)
	{
		dig=k%10;
		k=k/10;
		n++;
		
	}
	while(n>0) 
	{
		dig=sqr%10;
		sqr=sqr/10;
		sum=sum+(int)(dig*Math.pow(10,i));
		i++;
		n--;
	}
	 sumfinal=sum+sqr;
	 if(sumfinal==num)
	System.out.println("Kaprekar number");	
	 else
		 System.out.println("Not a kaprekar number");
	
	
}
}