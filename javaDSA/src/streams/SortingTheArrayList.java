package streams;
import java.util.*;
public class SortingTheArrayList {
public static void main(String args[]) {
	List<Integer>list=new ArrayList<>(Arrays.asList(8,6,7,9,2,4,1,8,3,6,89,74,21,58,44,66,88,72,64));
	list.stream()
		.sorted()
		.forEach(num->System.out.print(num+" "));
	
	list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	
	System.out.println();
	
	list.stream()
		.sorted()
		.forEach(System.out::println);
		
}
}
