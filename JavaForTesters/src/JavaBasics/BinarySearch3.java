package JavaBasics;
import java.util.Arrays;

public class BinarySearch3 {
	
	public static void binarySearchFunc(int searchNum, int arr[], int first, int last) {
		int mid, flag=-1;
		
		while(first<=last) {
			mid = (first+last)/2;
			
			if(searchNum == arr[mid]) {
				flag = mid;
				break;
			}
			
			if(searchNum < arr[mid]) {
				last = mid-1;
			}
			
			if(searchNum > arr[mid]) {
				first = mid+1;
			}
		} //end while
		if(flag<0)
			System.out.println("Num not found");
		else
			System.out.println("Num is at position: "+flag);
	} // end func

	public static void main(String args[]) {
		int arr[] = {0,1,2,3,4,5,6,7,8,9,11,10};
		int first = 0;
		int last = arr.length -1;
		int searchNum = 11;
		Arrays.sort(arr);
		binarySearchFunc(searchNum, arr, first, last);
	
	}
}
