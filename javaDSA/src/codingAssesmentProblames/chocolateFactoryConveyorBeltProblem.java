   package codingAssesmentProblames;

 //move all nonzeros at the end of array
public class chocolateFactoryConveyorBeltProblem {
public static void moveZerosAtTheEnd(int arr[]) {
	int j=0;//for position
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			j++;
		}
	}
	
	
}
public static void main(String args[]) {
	int arr[]= {0,1,0,3,12};
	moveZerosAtTheEnd(arr);
	for(int num:arr) {
		System.out.print(num+",");
	}
}
}
