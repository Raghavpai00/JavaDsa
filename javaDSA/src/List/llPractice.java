package List;

import java.util.Arrays;
import java.util.LinkedList;

public class llPractice {
public static void main(String args[]) {
	LinkedList<Integer>list=new LinkedList<>();
	list.addAll(Arrays.asList(10,20,30,40,50,60));
	list.add(70);
	list.add(80);
	list.add(90);
	System.out.println(list);
	System.out.println(list);
}
}
