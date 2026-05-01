package codingAssesmentProblames;
import java.util.*;
public class uniqueElementInAnArray {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	HashSet <Integer> hs=new HashSet<>();
	for(int i=0;i<=n;i++) {
		hs.add(sc.nextInt());
	}
	System.out.print(hs.size());
	sc.close();
}
}
