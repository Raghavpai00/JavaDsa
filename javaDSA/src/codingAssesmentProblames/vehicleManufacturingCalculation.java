package codingAssesmentProblames;
import java.util.*;

public class vehicleManufacturingCalculation {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	int v=sc.nextInt();
	int w=sc.nextInt();
	
	if(w%2!=0 || w<2*v || w>4*v) {
		System.out.println("invalid input");
		return;
	}
	
	int fw=(w-2*v)/2;
	int tw=v-fw;
	
	if(tw<0 || fw<0) {
		System.out.println("invalid input");
	}else {
		System.out.println(tw);
		System.out.println(fw);
		
	}
}
}
