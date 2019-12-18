package ebox1;

import java.io.*;
import java.text.*;
import java.util.*;
public class Main161{
    public static void main(String args[]) throws IOException{
         HashSet<String> hs = new HashSet<String>(); 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of words:");
      int s=sc.nextInt();    
      for(int i=0;i<s;i++)
      {
          hs.add(sc.next());
      }     
       System.out.println("Unique set of words:");
      List<String> list = new ArrayList<String>(hs);
        Collections.sort(list);     
       for(String k:list)
       {
          System.out.println(k);
       }     
    }
}
