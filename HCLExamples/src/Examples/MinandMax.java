package Examples;
import java.util.Scanner;
public class MinandMax {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int sum=x1+x2;
		if(x1>x2)
		{
			System.out.println(x1+" "+sum);
		}
		else
			System.out.println(x2+" "+sum);
	}

}


