package LabAssessment;
import java.util.Scanner;
import java.util.Arrays;
public class Program2 
{
	
void sort(int array[])
{
	int n = array.length;
	
   for(int i=0;i<n-1;i++)
   {
    	int min_idx=i;
    
        for (int j=i+1;j<n;j++)
        	
            if (array[j] < array[min_idx])
            	min_idx=j;
        
           int temp= array[min_idx];
        array[min_idx]=array[i];
        array[i]=temp;
}          
                 
}
void printArray(int array[])
{
	int n=array.length;
	for(int i=0;i<n;i++)
		System.out.print(array[i]+" ");
	System.out.println();
}
public static void main(String [] args)
{
		Program2 ob=new Program2();
		int array[]= {5,7,8,2,10,15,14,9};
		System.out.println("Numbers before sorting:5 7 8 2 10 15 14 9");
				ob.sort(array);
				System.out.println("After Bubble Sort:");
	ob.printArray(array);
}
}
	