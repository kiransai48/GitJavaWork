----------------------------------------------------------------------------------------------
Hello Java.......


public class HelloWorld {

	public static void main(String[] args)
	{
	       System.out.println("Hello Java.......");
	}
}

-------------------------------------------------------------------------------------------------
Hello Java.......0
I have done......!
Hello Java.......1
I have done......!
Hello Java.......2
I have done......!

public class ForLoop1 {

	public static void main(String[] args)
	{
		for(int i=0; i<3; i++)
		{
		    System.out.println("Hello Java......." + i);
		    System.out.println("I have done......!");
	    }
    }
}

---------------------------------------------------------------------------------------------
* 
* * 
* * * 
* * * * 
* * * * * 


public class Pattern1 {
	public static void main(String[] args)
	{
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		  System.out.println();
    }

    }

}


-------------------------------------------------------------------------------------------------
        * 
      * * 
    * * * 
  * * * * 
* * * * * 


public class Pattern2 {
	public static void main(String[] args)
	{
		int i, j, k=8;
		 for(i=0; i<5; i++)
		 {
			 for(j=0; j<k; j++)
			 {
				 System.out.print(" ");
			 }
			     k = k-2;
			       for(j=0; j<=i; j++)
			       {
			    	   System.out.print("* ");
			       }
		 System.out.println();
		 }
		 
	}


----------------------------------------------------------------------------------
     * * *
      * *
       *

(not tell)
public class pattern
{
    public static void main(String[] args)
    {
      
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= 3; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3-1; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}

-------------------------------------------------------------------------------------
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) 
	{
	  int i, space, rows, k=0;
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number of Rows :");
      rows = sc.nextInt();
      for(i=1; i<=rows; i++)
      {
    	  for(space=1; space<=(rows-i); space++)
    	  {
    		  System.out.print("  ");
    	  }
    	   while(k != (2*i-1))
    	   {
    		   System.out.print("* ");
    		   k++;
    	   }
    	   k=0;
    	   System.out.println();
      }
	}

}


---------------------------------------------------------------------------------------------

