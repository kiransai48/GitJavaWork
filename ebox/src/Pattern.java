import java.util.Scanner;

public class Pattern {

	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        
	        if(n%2==1)
	        for(int i=1;i<=n;i++) 
	        {
	        	for(int j=1;j<=n;j++) 
	        	{ 
	        		System.out.printf("*");
	        	}
	        	System.out.println();
	        }
	      
}
}