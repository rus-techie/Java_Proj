package JavaBasics;

public class binarySearch4 {

	public static void binarySearch(int[] a, int n) {
		int flag=-1, mid, first =0, last = a.length-1;
		while(first<=last) {
			mid = (first+last)/2;
			if(n==a[mid]) {
				flag=mid;
				break;
			}
				else if(n<a[mid]) {
					last=mid-1;
				}
				else if(n>a[mid]) {
					first = mid+1;
				}
			}
	if(flag>-1) {
		System.out.println("Element is at "+flag);
		}
	else {
			System.out.println("Element not found");
		}
	}
	
	public static void main(String[] args) {
		int n = 120;
		int[] a = {12,20,30,40,50,60,70,80,90,100};
		binarySearch(a,n);
	}
}
