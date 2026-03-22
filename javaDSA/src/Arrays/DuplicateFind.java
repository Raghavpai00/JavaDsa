package Arrays;

public class DuplicateFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("duplicare numbers are");
		
        int[] arr = {4, 2, 7, 2, 4, 9};
        for(int i=0;i<=arr.length-1;i++) {
        for(int j=i+1;j<=arr.length-1;j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]);
			break;
		}
	}
}
	}

}
