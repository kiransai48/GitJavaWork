import java.util.Scanner;
public class ReverseString {
	
	
	public static void main(String[] arg)
	{
		
		String reverse= "";
		int len;
		System.out.print("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		
		String  str=sc.nextLine();
		len=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		
		System.out.println("Reverse of a String :");
		System.out.println(	reverse);
		
		System.out.println("length of string="+len);
	}
}
		
	
		  

