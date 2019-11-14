package Examples;

public class Employee implements Comparable {

	//all instance variables are private
	private int employeeId;
	private StringBuilder employeeName;
	private boolean employeeStatus;
	private float employeeSalary;
	private String companyName;
	//default constructor
	Employee(){}
	
	//overloaded constructor
	public Employee(int employeeId, StringBuilder employeeName, boolean employeeStatus, float employeeSalary,
			String companyName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeStatus = employeeStatus;
		this.employeeSalary = employeeSalary;
		this.companyName = companyName;
	
    }

	public int getEmployeeId() 
	{
		return employeeId;
	}

	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}

	public StringBuilder getEmployeeName() 
	{
		return employeeName;
	}

	public void setEmployeeName(StringBuilder employeeName) 
	{
		this.employeeName = employeeName;
	}

	public boolean isEmployeeStatus() 
	{
		return employeeStatus;
	}

	public void setEmployeeStatus(boolean employeeStatus) 
	{
		this.employeeStatus = employeeStatus;
	}

	public float getEmployeeSalary() 
	{
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) 
	{
		this.employeeSalary = employeeSalary;
	}

	public String getCompanyName() 
	{
		return companyName;
	}

	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}

	
	public int compareTo(Object o) {
		
		Employee emp2=(Employee)o;
		return (int)(employeeId-emp2.employeeId);

	
	}
	
	
	
	
}
