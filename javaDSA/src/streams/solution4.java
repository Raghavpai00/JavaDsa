package streams;
import java.util.*;
import java.util.stream.Collectors;
public class solution4 {
public static void main(String args[]) {
	
	//find second highest number in stream
	
	List<Integer>list=DataFactory.getNumbersWithDuplicates();
	
	List<Integer>result=list.stream()
							 .distinct()
							 .sorted(Comparator.reverseOrder())
							 .skip(1)
							 .limit(1)
							 .collect(Collectors.toList());
	
	System.out.println("original"+list);
	System.out.println("result"+result);
}
}
