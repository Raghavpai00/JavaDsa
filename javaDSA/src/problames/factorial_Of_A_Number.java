package problames;
import java.util.*;
public class factorial_Of_A_Number {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter number for factorial");
int num=sc.nextInt();
int fact = 1;
for(int i=1;i<=num;i++) {
	fact=fact*i;
}

System.out.println("factorial of the number is "+fact);
}
}
