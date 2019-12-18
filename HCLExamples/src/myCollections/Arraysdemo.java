package myCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraysdemo implements Comparator {

public static void main(String[] args) {
int marks[]= {82,78,55};
String subjects[]= {"Maths","Physics","Chemistry"};
ArrayList<String> booklist=new ArrayList<String>();
booklist.add("Let us C by Yashwanth Kanethar");
booklist.add("Welcome to Java by Herbert Sheildt");
booklist.add("Core Java");

Collections.sort(booklist,Collections.reverseOrder());
//Collections.reverseOrder();

for(byte b=0;b<subjects.length;b++)
{
System.out.println(subjects[b]+"marks:"+marks[b]);
}
System.out.println("Before sorting an array:");
for(int m : marks)
{
System.out.println(m);
}
Arrays.parallelSort(marks);
System.out.println("After sorting an array:");
for(int m : marks)
{
System.out.println(m);
}
}

public int compare(Object arg0, Object arg1) {
String s1=(String)arg0;
String s2=(String)arg1;
if(s1.equals(s2))
{
	
}
return 0;
}
}