package JavaBasics;
import java.util.Scanner;

public class FactoriaRecursive {
	
	public static int factorial(int num){
		int fact=0;
		if(num==0) {
			return 1;
		}
		else {
		return (num*factorial(num-1));
		}
	}
	
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to find the factorial");
		num = sc.nextInt();
		System.out.println("The factorial is: " + factorial(num));
	}
}
