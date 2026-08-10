package map;

import java.util.*;
public class firstNonRepeatingElement {
public static void main(String args[]) {
	int arr[]= {10,5,3,4,3,5,6};
	HashMap<Integer,Integer>map=new HashMap<>();
	
	for(int num:arr) {
if(!map.containsKey(num)) {
	map.put(num,1);
}else {
	int value=map.get(num);
	map.put(num,value+1);
}
	}
	for(int num:map.keySet()) {
		if(map.get(num)>1) {
			System.out.println("1st repeating element is "+num);
			break;
		}
	}
	
	
	
}
}
