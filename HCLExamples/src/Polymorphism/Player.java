package Polymorphism;

public class Player {

	private String name;
	private int age;
	private String country;
	Player(String name,int age,String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public String toString() {
		return "Name:"+this.name+ " Age:"+this.age+ " Country:"+this.country;
	}
}
