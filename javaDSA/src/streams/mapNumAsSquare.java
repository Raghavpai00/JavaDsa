package streams;
import java.util.*;
public class mapNumAsSquare {
public static void main(String args[]) {
	List<Integer> list=new ArrayList<>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
	
	list.stream()
		.map(num->num*num)
		.forEach(System.out::println);
	
}
}
