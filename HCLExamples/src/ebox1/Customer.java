package ebox1;
public class Customer {
    
	private String name;
	private String pswd;
	
	public Customer() {
		super();
	}

	public Customer(String name, String pswd) {
		super();
		this.name = name;
		this.pswd = pswd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	

}