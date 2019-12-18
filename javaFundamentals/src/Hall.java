public class Hall {
    private String name;
	private String owner;
	public Hall(){
	}
	public Hall(String name, String owner) {
		this.name = name;
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public boolean equals(Object o) {
		Hall hallIns = (Hall)o;
		return (this.name.equals(hallIns.name) && this.owner.equals(hallIns.owner));
	}
	@Override
	public String toString() {
		return this.name + " - " + this.owner;
	}
}