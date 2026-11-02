package streams;
import java.util.*;
import java.util.stream.Collectors;
public class solution5 {
public static void main(String args[]) {
	
	//you hava a list of integers.divide numbers into even and odd
	//hint:use partition by
	List<Integer>list=DataFactory.getRawNumbers();
	Map<Boolean,List<Integer>>result=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
	System.out.println("original"+list);
	System.out.println("result"+result);
}
}
