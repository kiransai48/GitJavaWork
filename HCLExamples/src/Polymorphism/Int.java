package Polymorphism;


	import java.util.*;
	public class Int
	{
	public static void main(String[] args)
	{
	int i,n,c=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	for(i=1;i<n;i++)
	{
	if(n%i==0)
	c=c+i;
	}if(n==c)
	System.out.println("Perfect Number");
	else
	System.out.println("Not a Perfect Number");
	}
	}

