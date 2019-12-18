package CodeCamp;

import java.util.Scanner;

public class Program4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		int empId[]=new int[20];
		empId=input();
		sort(empId);
	}
static int[] input() {
	int[] empId=new int[20];
	for(int i=0;i<20;i++) {
		empId[i]=sc.nextInt();
	}
	return empId;
}
static void sort(int[] empId) {
	int temp;
	
	
	for(int i=0;i<empId.length;i++) {
		for(int j=i+1;j<empId.length;j++) {
			if(empId[i]<=empId[j]){
				temp=empId[i];
				empId[i]=empId[j];
				empId[j]=temp;
			}
		}
		
		
		System.out.println(empId[i]);
	
	}
	
}
}
