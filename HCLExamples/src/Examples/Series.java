package Examples;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner in=new Scanner(System.in);
		        int n=in.nextInt();
		        int f1=20;
		        int f2=40;
		        System.out.print(f1);
		        for(int i=0;i<n-1;i++)
		        {
		            f1=f1+f2;
		            System.out.print(" "+f1);
		            f2=f2+4;
		        }
	}
}
