package Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,45,89,78,36,14};
		
		System.out.println("the orignal array is : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		
		
		System.out.println("the reversed array is : ");
			for(int j=arr.length-1;j>=0;j-- ) {	
				System.out.print(arr[j]+" ");
			}
			
			
		}

	}


