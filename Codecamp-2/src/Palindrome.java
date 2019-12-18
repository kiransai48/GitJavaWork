import java.util.Scanner;
class Palindrome
{
   public static void main(String args[])
   {
      String string, reverse = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      string = sc.nextLine();
 
      int length = string.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + string.charAt(i);
 
      if (string.equals(reverse))
         System.out.println(string+" is a palindrome");
      else
         System.out.println(string+" is not a palindrome");
 
   }
}

	

