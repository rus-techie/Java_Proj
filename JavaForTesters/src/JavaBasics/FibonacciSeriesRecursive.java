package JavaBasics;

public class FibonacciSeriesRecursive {
	static int n1=0, n2=1, n3=0;
	public static void fibonacciSeriesRecursive(int max){
		if(max>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacciSeriesRecursive(max-1);
		}
	}
	
	public static void main(String args[]) {
		int max = 10;
		System.out.print("Fibonacci series is "+n1 + " " + n2);
		fibonacciSeriesRecursive(max-2);
	}
	
}
