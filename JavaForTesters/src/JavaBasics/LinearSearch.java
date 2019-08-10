package JavaBasics;

public class LinearSearch{
	
	public int linearSearchFunc(int arr[], int no) {
	//	int max = arr.length;
		for (int i=0;i<arr.length;i++) {
			if(no==arr[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int a[] = {10,20,30,40,50};
		int num=40; 
		int place;
		LinearSearch ls = new LinearSearch();
		place = ls.linearSearchFunc(a,num);
		System.out.println("The number is at the position "+place);
	}
}