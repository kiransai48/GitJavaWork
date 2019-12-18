package CodeCamp;


	import java.util.*;

	import java.text.*;

	import java.io.*;

	class Program15

	{

	    public static void main(String args[])throws Exception

	    {

	        Scanner sc=new Scanner(System.in);

	        String i,j="",k,x,y="",z,f="",g="";
	        int a=0,b=0,c=0,d=0,e;
	    	boolean flag = true;
			while(flag)
			{
	        try{
	        System.out.println("Enter Date1");

	        System.out.println("Enter day");

	        i=sc.nextLine();

	        a=Integer.parseInt(i);


	        System.out.println("Enter month");
	      
	       if(b<=12)
	       {
	    	   j=sc.nextLine();
	    	  
	       }
	       else
	    	   System.out.println("Ivalid");
	       b=Integer.parseInt(j);

	        System.out.println("Enter year");

	        k=sc.nextLine();

	        f=i+" "+j+" "+k;

	/*}
	catch(Exception e1 ){System.out.println("Wrong input"); }*/
	        System.out.println("Enter Date2");

	        System.out.println("Enter day");

	        x=sc.nextLine();

	        c=Integer.parseInt(x);

	        System.out.println("Enter month");
	        

	        

		       if(d<=12)
		       {
		    	   y=sc.nextLine();
		    	   
		       }
		       else
		    	   System.out.println("Ivalid");
		       d=Integer.parseInt(y);
	        System.out.println("Enter year");

	        z=sc.nextLine();


	        g=x+" "+y+" "+z;

	}
	catch(Exception e1 ){System.out.println("Wrong input");  }

			}
	        SimpleDateFormat myformat=new SimpleDateFormat("dd/MM/yyyy");

	        Date date1=myformat.parse(f);

	         Date date2=myformat.parse(g);

	         long diff=date2.getTime()-date1.getTime();

	         int day=(int)(diff/(3600000*24));

	          

	         if(a<32&&c<32&&b<13&&d<13)

	         {

	             if(day==0)

	             {

	                 System.out.println(day+1+" day");

	             }

	             else

	             {

	                 System.out.println(day+1+" days");

	             }

	       }

	         else

	         {

	             System.out.println("Invalid Date");

	         }

	         

	         

	    }

	}
	



