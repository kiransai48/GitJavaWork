import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);     
            //System.out.println("================================");
            for(int i=0;i<3;i++){        
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println();
                System.out.println("================================");
                if(i==0 && i==1 && i==2) {
                System.out.printf(s1+" " +x);
                System.out.println(s1+"  0"+x);
                System.out.println(s1+"  0"+x);
                }
            }
            System.out.println("================================");

    
}
}