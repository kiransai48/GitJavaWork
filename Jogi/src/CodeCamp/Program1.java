package CodeCamp;

import java.util.*;
import java.lang.*;
import java.io.*;
 
  
 
 class Student
 {
     int grades;
     String fname, lname;
  
     
     public Student(int grades, String fname,
                                String lname)
     {
         this.grades = grades;
         this.fname = fname;
         this.lname = lname;
     }
  
     
     public String toString()
     {
         return this.grades + " " + this.fname +
                            " " + this.lname;
     }
 }
  
 class Grades implements Comparator<Student>
 {
   
    
     public int compare(Student a, Student b)
     {
         return a.grades - b.grades;
     }
 }
  

 class Program1
 {
     public static void main (String[] args)
     {
         Student [] arr = {new Student(02, "chaitu", "krishna"),
                           new Student(01, "sai", "kiran"),
                           new Student(03, "aj", "jogi")};
  
         System.out.println("Unsorted");
         for (int i=0; i<arr.length; i++)
             System.out.println(arr[i]);
  
         Arrays.sort(arr, new Grades());
  
         System.out.println("\nSorted by grades");
         for (int i=0; i<arr.length; i++)
             System.out.println(arr[i]);
     }
 }