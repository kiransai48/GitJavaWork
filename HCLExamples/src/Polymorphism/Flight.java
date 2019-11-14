package Polymorphism;

public class Flight extends Bird implements inherit.Automobile{
	private int wheels;
	public String flightNumber;
	private String airlines;
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	@Override
	public boolean selfdriven() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void fly()
	{
		//we can call super class fly method also by using super keyword
		//super.fly();
		System.out.println("FLight" +this.flightNumber+" belongs to" +this.airlines+" starting..."+" has" +this.tails+"tail decorate with red color");
		System.out.println("Start first Engine");
		System.out.println("Drive the flight towards runway");
		System.out.println("Once flight reaches the runway");
		System.out.println("Start second Engine");
		System.out.println("Take Off");
	}
}
