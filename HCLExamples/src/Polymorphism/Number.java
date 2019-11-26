package Polymorphism;

import java.util.Scanner;
import java.lang.Math;
public class Number {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int k,i=0,num,n=0,sqr,dig,sum=0,sumfinal;
		k=s.nextInt();
		num=k;
		sqr=num*num;
		while(k>0)
		{
			dig=k%10;
			k=k/10;
			n++;
		}
		while(sqr>0)
		{
			dig=sqr%10;
			sqr=sqr/10;
			sum=sum+(int)(dig*Math.pow(10,i));
			i++;
			n--;
		}
		sumfinal=sum+sqr;
		if(sumfinal==k)
		System.out.println("Kaprekar Number");
		else
			System.out.println("Not a Kaprekar Number");
	}
}
