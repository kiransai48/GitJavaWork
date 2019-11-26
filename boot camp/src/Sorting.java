import java.util.Scanner;

public class Sorting {
public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Sorting ob = new Sorting();
        int k = 6;
		int arr[] = new int[k];
        System.out.println("Input the array elements:");
        for(int i = 0; i < k; i++)
        {
            arr[i] = sc.nextInt();
        }
       ob.sort(arr);  
        System.out.println("Array elements after sorting:");
        ob.printArray(arr);
}
}
