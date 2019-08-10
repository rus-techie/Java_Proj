package JavaBasics;

public class BinarySearchExample {
	
	public static void binarySearch(int arr[], int first, int last, int key) {
		
	int	mid = (first+last)/2;
	if (key==0)
		System.out.println("Element not found");
	while (first<=last) {
		if (key==arr[mid])
			System.out.println("The indesx position of the key is " + mid);
		else 
			if (key < arr[mid])
				last = arr[mid];
	
		}
	}
	

	public static void main (String args[]) {
		int arr[] = {20,10,40,50,75,90,82,12,5};
		int key = 90;
		int first = 0;
		int last = arr.length - 1;
		binarySearch(arr, first, last, key);
	}
	
}
