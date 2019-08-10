package JavaBasics;

class MySearch{
	
	public int binarySearch(int[] numArr, int target) {
		int start = 0;
		int end = numArr.length-1;

		while(start<end) {
				
			int mid = (start+end)/2;
			
			if(target==numArr[mid]) {
				return mid;
			}
			
			if(target<numArr[mid]) {
				end=mid-1;
			}
			
			if(target>numArr[mid]) {
				start=mid+1;
			}
		}
		return -1;
	}
}

public class BinarySearch {

	
	public static void main(String[] args) {
		MySearch obj = new MySearch();
		int indexNo;
		int[] arr = {1,3,5,9,15,21,35,47,59};
		int num=9;
		
		indexNo = obj.binarySearch(arr, num);
		if(indexNo < 0)
			System.out.println("The entered number is not in the array");
		else
			System.out.println("The array index of the number is: "+indexNo);
	}
	
}
