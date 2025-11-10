package problames;
import java.util.*;
public class FibonacciSeries {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number for series");
	int n=sc.nextInt();
	int first=0,second=1;
	System.out.print("fibonacci series till "+n+"termas ");
	for(int i=1;i<=n;i++) {
		System.out.print(first+" ");
		int next=first+second;
		first=second;
		second=next;
	}
}
}
