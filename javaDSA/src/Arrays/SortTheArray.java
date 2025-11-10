package Arrays;

public class SortTheArray {
	public static void main(String args[]) {
	int arr[]= {14,2,1,9,78,56,25,48};
//		System.out.println("the orignal array is: ");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+",");
//		}
//		int temp=0;
//		for(int i=0;i<=arr.length-1;i++) {
//			for(int j=i+1;j<=arr.length-1;j++) {
//				if(arr[i]>arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println();
//		System.out.println("the sorted array is: ");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+",");
//		}
		
		System.out.println("the org array is: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("the sorted array is: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
																