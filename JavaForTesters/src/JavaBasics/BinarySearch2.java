package JavaBasics;

public class BinarySearch2 {
	
	public static void binarySearchFunc(int arr[], int numSearch, int first, int last) { 
		int flag=-1, mid;
		
		while(first<=last) {
			mid = (first+last)/2;
			
			if(numSearch == arr[mid])
				{
				flag = mid;
				break;
				}
				
			if(numSearch > arr[mid]) {
				first = mid+1;
				}
			
			else if(numSearch < arr[mid]) {
				last = mid-1;
				}
		}
		
		if(flag<0)
			System.out.println("Number not found");
		else
			System.out.println("The number is at position: "+flag);
		
	}
	
	
	public static void main(String args[]) {
		int arr[] = {12,20,30,40,50,60,65,70,75,80,90};
		int numSearch = 90;
		int first = 0;
		int last = 10;
		binarySearchFunc(arr,numSearch, first, last);
	}
}
