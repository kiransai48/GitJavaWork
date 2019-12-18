
 class Test {
	public static void m1(int i)
	{
		try {
			if(i<0) return;
			int j=10/i;
		}
		catch(Exception e) {
			System.out.println("caught");}
		finally {System.out.println("thanks");}
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1(-10);
}
}