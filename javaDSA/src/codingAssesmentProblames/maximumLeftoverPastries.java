package codingAssesmentProblames;
import java.util.*;
public class maximumLeftoverPastries {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("enter number of testcases");
		int n=sc.nextInt();
		
		if(n<=2) {
			System.out.print(n);
		}else {
			System.out.print((n/2)+1);
			//System.out.print((n-1)/2);
		}
	}

}
