package JavaBasics;
import java.util.Scanner;

public class LinearSearchInput {
	
	public int searchFunc(int num,int a[]) {
		//Search the element in the array
				for (int j=0; j<a.length;j++)
					{
					if(a[j]==num)
						return j;
					}
				return -1;
	}
	
	public void enterArray() {
		int arr[], num, flag=-1;
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the number of elements");
		int arrLength = sc.nextInt();
		arr = new int[arrLength];
		
		System.out.println("Enter the array elements");
		for(int i=0; i<arrLength;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to search");
		num = sc.nextInt();
		
		flag = searchFunc(num,arr);
		if (flag<0)
			System.out.println("Element not found");
		else
			System.out.println("Element is at position: "+ flag);
		
		sc.close();
	}
			
	public static void main(String args[]) {
		LinearSearchInput ls = new LinearSearchInput();
		ls.enterArray();
		}

}
