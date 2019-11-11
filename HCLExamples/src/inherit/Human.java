package inherit;

public class Human extends Species {
public static int legs=2;
private boolean swimmingStatus;

//Human constructor
Human()
{
	swimmingStatus=false;
	System.out.println("Human Interface");
}

public static void talk()
{
	System.out.println("can talk");
}
public void walk()
{
	System.out.println("can walk"+ "with" +legs+ "legs.");
}
}
