package JavaBasics;

public class FibonacciSeries {
	public static void main(String args[]) 
		{
		int n1=0, n2=1,n3, max=10;
		
		//System.out.println("Fibonacci series is " + n1 + " " + n2);
		
		for(int i=0;i<max;i++) 
			{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;	
			}
		}
}
