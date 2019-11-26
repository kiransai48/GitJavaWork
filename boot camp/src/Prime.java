import java.util.Scanner;
public class Prime {
public static void main(String args[])
{
		int n;
		boolean isPrime=true;
		Scanner sc =new Scanner(System.in);
		System.out.print("Input any Integer : ");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			int  temp=n%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
			if(isPrime)
			System.out.println(n+ "p");
  }
}
