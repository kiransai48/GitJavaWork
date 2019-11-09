package oop;

public class Boxingdemo {
	
	public static void main(String args[])
	{
		int a=0;
	    int b=0;
	if(args.length!=0)
	{
		//unboxing
		//convert string object into int value to store it in a
		a=Integer.parseInt(args[0]);
		//convert string object into int value to store it in b
		b=Integer.parseInt(args[1]);
		
		Integer result=a+b;

		System.out.println(a+b);
	}
	else
	{
		System.out.println("Please pass two integers as arguments!");
	}
	}

}
