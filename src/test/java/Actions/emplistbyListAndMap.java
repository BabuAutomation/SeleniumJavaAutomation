package Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.hpsf.Array;

class Employee{
	String name;
	String dept;
	
	Employee(String name, String dept){
		this.name=name;
		this.dept=dept;
	}
}

public class emplistbyListAndMap {

	public static void main(String[] args) {
		
		List<Employee> employees= Arrays.asList(
				new Employee("Ravi", "IT"),
				new Employee("Mukta", "HR"),
				new Employee("Bujji", "IT"),
				new Employee("Vasu", "Fin")
				);
		Map<String, List<String>> deptmap=new HashMap<>();
		
		for(Employee emp:employees) {
			deptmap.computeIfAbsent(emp.dept, k->new ArrayList<>()).add(emp.name);
			
			
		}
		for(Map.Entry<String, List<String>> entry:deptmap.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
		
	}

}
