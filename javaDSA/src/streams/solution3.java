package streams;
import java.util.*;
public class solution3 {
public static void main(String args[]) {
	//Find the 2nd and 3rd elements
	List<Integer>list=DataFactory.getNumbersWithDuplicates();
	List<Integer>result=list.stream()
							.skip(1)
							.limit(2)
							.toList();
	System.out.println("original"+list);
	System.out.println("original"+result);
}
}
