import java.util.Scanner;
public class CommonDistinct {
	public static void main(String[] args) 
		{
			int flag=0;
		int[] array1=new int[5];
		int[] array2=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First array elements"); 
		for(int i=0; i<5; i++)
		{
			array1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Second array elements"); 
		for(int i=0; i<5;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		
		//comparing elements in two arrays
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			if(array1[i]==array2[j])
			{
				System.out.println("common element is "+array1[i]);
				i++;
				flag=1;
			}
			}
		}
		if (flag==0) {
			System.out.println("Distinct elements");
		
			}
		 }
	
}


