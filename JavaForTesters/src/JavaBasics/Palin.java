package JavaBasics;

// Palindrome

public class Palin {

	public static void main(String[] args) {
		int num = 4549, reverse=0, remainder;
		int temp = num;
		while (temp>0) {
			remainder = temp%10;
			reverse = (reverse*10) + remainder;
			temp = temp/10;		
		}
		if (num == reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		}
}
