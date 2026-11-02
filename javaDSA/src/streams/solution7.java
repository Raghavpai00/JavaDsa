package streams;
import java.util.List;
import java.util.Optional;

import streams.DataFactory.Employee;
public class solution7 {
public static void main(String args[]) {
	//from a list of employee,find first employee whose salary is greater than 50000
	
	List<Employee>list=DataFactory.getEmployees();
	Optional<Employee>result=list.stream()
					.filter(n->n.getSalary()>50000)
					.findFirst();
	
	if(result.isPresent()) {
		System.out.println("original"+list);
		System.out.println("result "+result); 
	}
}
}
