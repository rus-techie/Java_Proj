package JavaBasics;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
	
	public int binarySearchFunc(int n,int a[]) {
		int start=0, end= a.length;
		int mid = end/2;
		if(n==mid)
			return mid;
		for(int i=start;i<end;i++) {
			if(n==mid)
				return mid;
			if(n<mid)
				end=mid;
			if(n>mid)
				start=mid;
		}
		return -1;
	}
	
	public void getArray() {
		int arr[],max, num;
		int flag=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array length");
		max = sc.nextInt(); 
		
		arr = new int[max];
		System.out.println("Enter the array elements");
		for(int i=0;i<max;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the number to search");
		num = sc.nextInt();
		
	//	int sortedArr[] = new int[max];
		Arrays.sort(arr);
		flag = binarySearchFunc(num,arr);
		if(flag<0)
			System.out.println("Number not found");
		else
			System.out.println("Number is at position: "+flag);
		
		sc.close();
	}
	
	public static void main(String args[]) {
		BinarySearch1 bs = new BinarySearch1();
		bs.getArray();
	}

}
