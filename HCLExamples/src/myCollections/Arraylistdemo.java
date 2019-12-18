package myCollections;

import java.util.ArrayList;

public class Arraylistdemo {

public static void main(String[] args) {
//Heterogeneous collection
ArrayList al=new ArrayList();
int myage=43;
String myname="Praveen";
long mymemory=123456789L;

al.add(myname);
al.add(myage);
al.add(mymemory);

System.out.println("al");
//homogeneous collection
ArrayList<String> elist=new ArrayList<String>();
elist.add("Jogeswara rao");
elist.add("Sai kiran");
elist.add("Chaitanya");

for(String s: elist)
{
System.out.println("Employee:"+s);
}

if(elist.contains("Praveen"))
{
System.out.println("Praveen is also inside collection of employees");
}else
{
System.out.println("Praveen is not a employee!!!");
}

}

}