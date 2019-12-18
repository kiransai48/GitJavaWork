import java.util.Scanner;
	public class Marks {
	public static void main(String[] args) {
	String ename;
	int digital,digital1,digital2;
	int java,java1,java2;
	int networking,networking1,networking2;
	int digitalsum,digitalavg;
	int javaavg,javasum;
	int networksum,networkavg;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter scholar1 name");
	ename=sc.next();
	System.out.println("enter the marks of digital logic");
	digital=sc.nextInt();
	System.out.println("enter marks of java");
	java=sc.nextInt();
	System.out.println("enter marks of networking");
	networking=sc.nextInt();
	System.out.println("enter Scholar 2 name:");
	ename=sc.next();
	System.out.println("enter marks of digital logic");
	digital1=sc.nextInt();
	System.out.println("enter marks of java");
	java1=sc.nextInt();
	System.out.println("enter marks of networking");
	networking1=sc.nextInt();
	System.out.println("enter Scholar 3 name:");
	ename=sc.next();
	System.out.println("enter marks of digital logic");
	digital2=sc.nextInt();
	System.out.println("enter marks of java");
	java2=sc.nextInt();
	System.out.println("enter marks of networking");
	networking2=sc.nextInt();
	digitalsum=digital+digital1+digital2;
	digitalavg=digitalsum/3;
	System.out.println("average of Digital-Logic of three scholars is:"+digitalavg);
	javasum=java+java1+java2;
	javaavg=javasum/3;
	System.out.println("average of Java of three scholars is"+javaavg);
	networksum=networking+networking1+networking2;
	networkavg=networksum/3;
	System.out.println("average marks in networking of three scholars is"+networkavg);
	}

	}


