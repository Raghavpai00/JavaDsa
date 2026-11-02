 package streams;
import java.util.*;
import java.util.stream.Collectors;
public class solution3 {
public static void main(String args[]) {
	//Find the 2nd and 3rd elements
//	List<Integer>list=DataFactory.getNumbersWithDuplicates();
//	List<Integer>result=list.stream()
//							.skip(1)
//							.limit(2)
//							.toList();
//	System.out.println("original"+list);
//	System.out.println("original"+result);
	
	List<Integer>list=DataFactory.getRawNumbers();
	List<Integer>result=list.stream()
							.skip(1)
							.limit(2)
							.collect(Collectors.toList());
	
	System.out.println("original"+list);
	System.out.println("result"+result);
	
	
}
}
