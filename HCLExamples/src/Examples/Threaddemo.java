package Examples;

class MyThread1 extends Thread
{
	MyThread1()
	{
		System.out.println("myThread created");
	}
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("myThread"+this.getName()+"is running");
			try {
				this.sleep(1000);
				}catch(InterruptedException ie)
			{
					System.out.println("thread"+this.getName()+"interrupted!!!");
			}
	}

	}
}
public  class Threaddemo {

	public static void main(String[] args)
	{
		MyThread1 mt=new MyThread1();
		mt.start();
		MyThread1 nt=new MyThread1();
		nt.start();
	}
}

