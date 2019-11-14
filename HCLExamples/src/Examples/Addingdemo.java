package Examples;

//exception handling
//custom handling
class Myexception extends Exception
{
	//constructor
	Myexception()
	{
		System.out.println("My exception created");
	}
	public Myexception handler()
	{
		System.out.println("Exception handled here....");
		return this;
	}
}
public class Addingdemo {

	public static void main(String[] args) {

		int a,b;
		Integer result;
		if(args.length!=2)
		{
			System.out.println("Please pass two numbers as arguments");
		}else
		{
		try 
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			result=a/b;
			System.out.println(result);
		}catch(ArithmeticException ae)
		{
			System.out.println("Please pass non-ZERO value as 2nd arguments!!!");
		}catch(NumberFormatException ne)
		{
			System.out.println("Please pass numbers only as arguments!!!");
		}
		
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("Exception occured!");
		}finally {
			result=null;
			System.out.println("Result object set to null,Finally block executed");
		}
	
		}

	}

}
