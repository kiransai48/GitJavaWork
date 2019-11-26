package Examples;


	import java.util.*;
	public class Data {
	public static void main(String args[])
	{
	
				int roll,temp;
				int oddsum=0,evensum=0;
				Scanner sc=new Scanner(System.in);
				roll=sc.nextInt();
				while(roll!=0)
				{
					temp=roll%10;
					if(temp%2==0)
					
						evensum=evensum+temp;
					
					else
						oddsum=oddsum+temp;	
				
				roll=roll/10;
				}
			
				if(evensum==oddsum)
				
					System.out.println("yes");
					
				else
					System.out.println("no");
	}
	}

