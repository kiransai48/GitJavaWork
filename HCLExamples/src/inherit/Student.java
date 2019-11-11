package inherit;

public class Student extends Human {
    public int rollNumber;
    public StringBuilder studentname;
    
    //constructor
    
    Student()
    {
    	System.out.println("Student object constructed");
    }
    
    //constructor overloading
	
    public Student(int rollNumber, StringBuilder studentname) 
    {
		this.rollNumber = rollNumber;
		this.studentname = studentname;
	}
    
  
    
}
