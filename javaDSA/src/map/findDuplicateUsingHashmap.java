package map;
import java.util.*;
public class findDuplicateUsingHashmap {
public static void main(String args[]) {
	int arr[]= {1,2,3,1,5,4,6,4,7,8,7,8,9};
	Map<Integer,Integer>map=new HashMap<>();
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
			System.out.println("dumplicate number is "+num);
		}
	}
	
}
}
