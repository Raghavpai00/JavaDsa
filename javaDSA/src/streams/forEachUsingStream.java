package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class forEachUsingStream {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		list.stream().forEach(num->System.out.println(num));
		
				list.stream()
				.filter(elem->elem%2==0)
				.forEach(elem->System.out.println(elem));
	}
}
