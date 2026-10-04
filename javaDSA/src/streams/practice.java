package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class practice {
public static void main(String args[]) {
	List<Integer> nums=Arrays.asList(4,5,6,7,8,9);
	Stream<Integer> data=nums.stream();
	 data.forEach(n -> System.out.println(n));
	 
	 String str="raghav pai";
	 Stream.of(str).forEach(n->System.out.println(n));
	 
	 int arr[]= {1,2,3,4,5,6,7,8,9};
	 Arrays.stream(arr).forEach(n->System.out.print(n));
	 
	 int arr2[]= {4,8,9,7,3,2,8,6,7,6,32,12,54,78,98,66};
	 Arrays.stream(arr2).
	 sorted()
	 .distinct()
	 .forEach(System.out::println);
	 
	 
}
}
