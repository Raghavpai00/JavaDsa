package codingAssesmentProblames;

import java.util.Arrays;

public class containsDuplicate {
public boolean ContainsDuplicate(int[] nums) {
	Arrays.sort(nums);
	
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==nums[i+1]) {
			return true;
		}
	}
	return false;
}
public static void main(String args[]) {
	int nums[]= {1,1,2,3,4,5,5,6,7,8,8,9,10,10};
	containsDuplicate cs=new containsDuplicate();
	System.out.println(cs.ContainsDuplicate(nums));
	
}
}
