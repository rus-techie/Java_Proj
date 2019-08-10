package JavaBasics;

public class AddNumbers {
	
		public int[] twoSum(int[] nums, int target) {
			int subTotal=0;
			int resultNum[] = new int[nums.length];
			
	        for (int i = 0; i<4; i++) {
	        	subTotal += nums[i]; 
	        	resultNum[i] = nums[i];
	        }
	        	if(subTotal == target)
	        		System.out.println("They are equal and the sum is: " + subTotal);     		
	        	else
	        		System.out.println("The Sum is not equal to "+target);
	        	
	        	return resultNum;
	        
	    }
	

}
