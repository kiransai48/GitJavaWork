package inherit;

public class Studentdemo {
	
	public static void main(String[] args)
	{
		Student s1=new Student(1234,new StringBuilder("SaiKiran"));
		/*s1.rollNumber=1234;
		s1.studentname.append("Sai");*/
		s1.breathe();
		s1.talk();
		s1.walk();
		
	}

}
