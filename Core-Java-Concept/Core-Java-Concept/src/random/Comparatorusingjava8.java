package random;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Comparatorusingjava8 {
	public static void main(String[] args) {
		Map<Integer, Employee> empmap = new HashMap<>();
		empmap.put(1, new Employee("Satyam", 21));
		empmap.put(2, new Employee("Sam", 24));
		empmap.put(3, new Employee("Mukul", 22));

		Stream<Entry<Integer, Employee>> s = empmap.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().getSalary().compareTo(e2.getValue().getSalary()));
		s.forEach(e-> System.out.println(e.getKey()+"--"+e.getValue()));
	}
}
