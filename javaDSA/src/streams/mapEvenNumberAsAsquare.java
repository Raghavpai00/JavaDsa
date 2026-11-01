package streams;
import java.util.*;
public class mapEvenNumberAsAsquare {
public static void main(String args[]) {
	int arr[]= {31,32,33,34,35,36,37,38,39,40};
	Arrays.stream(arr)
		  .filter(n->n%2==0)
		  .map(n->n*n)
		  .forEach(System.out::println);
}
}
