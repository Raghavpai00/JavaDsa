package mustKnow;

public class factorialOfANumber {
public static void main(String args[]) {
	int n=10;
	int factorial =n;
	
	for(int i=n-1;i>=1;i--) {
		factorial*=i;
	}
	System.out.println("factorial of a number is:"+factorial);
}
}
