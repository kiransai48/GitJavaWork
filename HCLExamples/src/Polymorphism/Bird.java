package Polymorphism;

public class Bird {
	//instance variables or class variables
	public static int legs=2;
	public static int wings=2;
	public String birdName;
	public String birdColor;
	private boolean canSing;
	protected int tails=1;
	
	//methods to describe behavior of object
	public boolean isCanSing() {
		return canSing;
	}
	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}
	
	//defining fly method in Bird class
	public void fly()
	{
		System.out.println("Start swinging wings");
		System.out.println("Balance body");
		System.out.println("Observe wind direction");
		System.out.println("Based on that swing left or right wing");
	}
}
