package random;

public class Employee {
	String name;
	Integer salary;

	
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
