import java.util.Scanner;
	public class Smallarray {
		static Scanner sc= new Scanner(System.in);
		public static int getSmallest(int[] k) {
		int tem;
		for(int i=0;i<10;i++)
		{
		for(int j=i+1;j<10;j++)
		{
		if(k[i]>k[j])
		{
		tem=k[i];
		k[i]=k[j];
		k[j]=tem;
		}
		}
		}
		return k[0];

		}
		public static void main(String[] args)
		{
		int k[]=new int[10];
		System.out.println("Enter the numbers:");
		for(int i=0;i<10;i++)
		{
		k[i]=sc.nextInt();
		}
		int smallestnumber=getSmallest(k);
		System.out.println("Smallest number in array is:"+smallestnumber);
		}
		}


