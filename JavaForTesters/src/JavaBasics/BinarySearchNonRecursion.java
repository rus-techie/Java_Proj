package JavaBasics;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchNonRecursion{

	public static void binarySearchFunc(int numSearch, int arr[], int start, int end){
		int mid, position=-1;
		
		Arrays.sort(arr);
		
		while (start<=end){
			mid = (start+end)/2;
		
			if(numSearch == arr[mid]){
				position = mid;
				break;
				} // if ends
			
			if(numSearch < arr[mid]){
				end = mid-1;
				}

			if(numSearch > arr[mid]){
				start=mid+1;
				}
			
		} //end of while
		
		if(position<0)
			System.out.println("Number not found");
		else
		System.out.println("The number is at position "+position);	
	}
	
	public static void binaryRecurssionSearchFunc(int numSearch, int arr[], int start, int end) {
		
	}

	public static void main(String args[])
		{
		int arr[] = {0,5,10,15,20,25,30,35,40};
		int numSearch = 20;
		int start = 0;
		int end = arr.length - 1;

		binarySearchFunc(numSearch, arr, start,end);

//Input from user
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the length of the array");
		int max = sc.nextInt();
		int arr1[] = new int[max];
		//int arr1[] = new int[3];
		//int arr2[][] = {{1,2,3},{4,5,6}};
		//arr1[0] = 0;
		//arr1[1] = 1;
		//arr1[2] = 2;
		
		
		System.out.println("Enter the array");
		for(int i=0; i<max; i++)
		arr1[i] = sc.nextInt();
		start=0;
		end=max-1;
		
		System.out.println("Enter the num to search in the array");
		numSearch = sc.nextInt();
		
		binarySearchFunc(numSearch, arr1, start,end);
		}
}
