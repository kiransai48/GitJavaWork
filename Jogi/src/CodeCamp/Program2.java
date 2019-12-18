package CodeCamp;

	class OverloadDemo {

		void area(float b,float f)
		{

		
		double t=2*3.145*b;
		System.out.println("Parimeter of the Circle : "+t);
		double p=3.145*f*f;
		System.out.println("Area of the Circle : "+p);
		}

		void area(double r,float b)
		{
		double r1=Math.sqrt(5 * 7* (Math.sqrt(5))) * r * r / 4;
		System.out.println("Area of the Pentagon : "+r1);
		}

		void area(double p)
		{
		double s=Math.pow(p, 2);
		System.out.println("Area of the Square : "+s);
		}

		}

		class OverloadDemo1 {

		void area(double ... args)
		{

		System.out.println("Using var-args method:");

		System.out.println("Parimeter of the Circle : "+3.145*args[1]*args[1]);
		System.out.println("Area of the Circle : "+0.5f*3.145*args[0]);
		}

		void area(float ... args)
		{
		System.out.println("Area of the Pentagon : "+Math.sqrt(5 * 7* (Math.sqrt(5))) * args[0] * args[0] / 4);
		}

		void area()
		{
			double args[] = {};
		System.out.println("Area of the Square : "+Math.pow(args[0], 2));
		}

		}
		public class Program2 {
		 
		public static void main(String args[])throws ArrayIndexOutOfBoundsException
		{
		OverloadDemo od=new OverloadDemo();
		od.area(9.42,5);
		od.area(9.0f,2.4f);
		od.area(5.88f);
		
		}
		 }
