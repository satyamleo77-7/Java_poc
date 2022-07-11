package Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Distinctusingstream {

	public static void main(String[] args) {
		Employee emp= new Employee(101, "aaa", 10, "male", "sales", 1000);
		Employee emp1 = new Employee(102, "bbb", 10, "male", "kkk", 2000);
		Employee emp2 = new Employee(103, "ccc", 10, "female", "sales", 2000);
		Employee emp3 = new Employee(104, "ddd", 10, "male", "sales", 5000);
		Employee emp4 = new Employee(105, "bbb", 10, "male", "sales", 5000);
		List<Employee> empList = new ArrayList<>();
		empList.add(emp); empList.add(emp1); empList.add(emp2); empList.add(emp3); empList.add(emp4);
		Set<String> set = new HashSet<String>();
		Employee empstream=empList.stream().filter(e->e.getName().equals("aaa")).findAny().orElse(null);
		//System.out.println(empstream);
		empList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		/**		Reading from a Map based **/
		Map<Integer, Employee> empMap=new HashMap<Integer, Employee>();
		empMap.put(1, emp);  empMap.put(2, emp1);  empMap.put(3, emp2); empMap.put(4, emp3); empMap.put(5, emp4);
		empMap.entrySet().stream().sorted((e1,e2)->-e1.getValue().getSalary().compareTo(e2.getValue().getSalary()));
		
	}
}
class Employee {

	Integer id;
	String name;
	Integer age;
	String gender;
	String dept;
	Integer salary;
	public Employee(Integer id, String name, Integer age, String gender, String dept, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}
	

}
