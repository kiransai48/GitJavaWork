
	import java.util.Scanner;
	public class Swap {
	    public static void main(String args[])
	    {
	        int x,y;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Input two integers: ");
	        x=sc.nextInt();
	        y=sc.nextInt();
	        System.out.println("Pre swap: "+x+" "+y);
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("Post swap: " +x+" "+y);
	    }
	}

