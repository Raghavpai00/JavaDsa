package streams;
import java.util.Comparator;
import java.util.List;
public class solution1 {
public static void main(String args[]) {
	
	//Q1. Remove duplicates & sort in descending order
	
	List<Integer> list=DataFactory.getNumbersWithDuplicates();
List<Integer>result=list.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.toList();
	
	System.out.println("original"+list);
	System.out.println("original"+result);
	
	

}
}
