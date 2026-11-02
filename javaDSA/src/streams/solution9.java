package streams;
import java.util.List;
import java.util.stream.Collectors;

import streams.DataFactory.Employee;
public class solution9 {
public static void main(String args[]) {
	//from a list of employees,sort employees by salary,then by name
	
	List<Employee>list=DataFactory.getEmployees();
	
	List<Employee> result=list.stream()
		.sorted((emp1,emp2)->{
			if(emp1.getSalary()>emp2.getSalary()) {
				return 1;
			}else if(emp1.getSalary()<emp2.getSalary()) {
				return -1;
			}else {
				return emp1.getName().compareTo(emp2.getName());
			}
		})
		.collect(Collectors.toList());
	System.out.println("original "+list);
	System.out.println(" result "+result);
}
}
