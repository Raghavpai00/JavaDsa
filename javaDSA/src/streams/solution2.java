package streams;

import java.util.*;
public class solution2 {
public static void main(String args[]) {
	//Filter odd numbers & square them
	List<Integer>list=DataFactory.getRawNumbers();
	List<Integer>result=list.stream()
							.filter(n->n%2==0)
							.map(n->n*n)
							.toList();
	System.out.println("original"+list);
	System.out.println("original"+result);
}
}
