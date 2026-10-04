package List;

import java.util.Arrays;
import java.util.LinkedList;

public class reverseTheLinkedList {
public static void main(String args[]) {
	LinkedList<Integer>list=new LinkedList<>();
	list.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
	
	for(int i=list.size()-1;i>=0;i--) {
		System.out.print(list.get(i)+" ");
	}
}
}
  