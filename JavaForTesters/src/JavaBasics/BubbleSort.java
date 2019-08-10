package JavaBasics;

public class BubbleSort{
	
	public int [] bubbleSort(int arr[]) {
		int max = arr.length;
		int temp=0;
		for (int i=0;i<max; i++) {
			for (int j=1;j<(max); j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public void display(int arr[]) 
		{
		int end = arr.length;
		for (int i=0; i<end;i++)
			System.out.println(arr[i]);
		}
	
	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		int a[] = {23,2,5,0,12,6,22,34,8,4};
		int b[];
		b = bs.bubbleSort(a);
		bs.display(b);
	}
}