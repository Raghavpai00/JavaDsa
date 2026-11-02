package streams;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import streams.DataFactory.Employee;
public class solution8 {
public static void main(String args[]) {
	
	//from the list of employees , give top 2 highest payed employees
	
	List<Employee>list=DataFactory.getEmployees();
	
	List<Employee>result=list.stream()
							 .sorted(Comparator.comparing(Employee::getSalary).reversed())
							 .limit(2)
							 .collect(Collectors.toList());
		
	result.forEach(System.out::println);
	
}
}
