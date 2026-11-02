package streams;
import java.util.*;
public class solution6 {
public static void main(String args[]) {
	
	//find longest string in a list
	
	List<String>list=DataFactory.getWordsList();
	Optional<String>result=list.stream()
							.max(Comparator.comparing(n->n.length()));
	if(result.isPresent()) {
		System.out.println("original"+list);
		System.out.println(" result "+result);
	}
}
}
