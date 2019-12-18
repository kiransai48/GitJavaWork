package day3;



	class OverloadDemo {

		void area(double b,double f)
		{

		System.out.println("Using overloaded method:");
		double t=2*3.145*b;
		System.out.println("Parimeter of the Circle : "+t);
		double p=3.145*f*f;
		System.out.println("Area of the Circle : "+p);
		}

		void area(float a, float b)
		{
		float r=a*b;

		System.out.println("Area of the Pentagon : "+r);
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
		System.out.println("Area of the Rectangle : "+args[0]*args[1]);
		}

		void area()
		{
			double args[] = {};
		System.out.println("Area of the Square : "+Math.pow(args[0], 2));
		}

		}
		 public class Overload
		 {
		public static void main(String args[])throws ArrayIndexOutOfBoundsException
		{
		OverloadDemo od=new OverloadDemo();
		od.area(9.42,5);
		od.area(9.0f,2.4f);
		od.area(5.88f);
		
		}
		 }
