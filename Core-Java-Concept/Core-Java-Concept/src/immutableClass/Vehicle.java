package immutableClass;

public class Vehicle {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle(String name) {
		super();
		this.name = name;
	}
	
}
