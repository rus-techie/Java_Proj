package JavaBasics;
import java.util.Scanner;
public class PrimeNumber {
	
	public static void calculatePrimeNum(int maxNum) {
		int mid, flag=0;
		System.out.print("Prime numbers are: " + 1 + " "+ 3 + " ");
		
		for(int i=4;i<=maxNum;i++) {
			//1,3,5,7,11,13,17,19
			mid = i/2;
			for (int j=2;j<=mid;j++) {	
				if(i%j==0) {
					flag = 1;
					break;
			}
				else 
					continue;	
			}
			if(flag==0)
			System.out.print(i+ " ");
		}
	}
	
	public static void main(String args[]) {
		//Print prime numbers, that are only divisible by themselves
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the maximum numbers to print");
		int max = s.nextInt();
		calculatePrimeNum(max);
		s.close();
	}

}
