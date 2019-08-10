package JavaBasics;
import java.util.Scanner;

public class MyString {
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.next();
		int max = s1.length();
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.next();
		int max = s1.length();
		int temp;
		String ch = s1.trim().split("");

		for (int i = 0; i<ch.length; i++) {
		ch[i] = ch[i].substring(0, 1).toUpperCase() + ch[i].substring(1);
		}		
		
		String str = new String(ch);
		System.out.println(str);
			/*
			String str = ch[i];
			char ch1[] = str.toCharArray();	
			temp = (int)ch1[1];
			temp = temp-32;
			ch1[1] = (char) temp;
		}
	String str2 = ch.toString();

	System.out.println(str2);
*/		
		
		
		
		/*System.out.println("Enter second string");
		String s2 = sc.nextLine();
		String s3 = s1+s2;

		System.out.println("Added strings " + s3);
		*/
		/*
	int temp;
	String S4 = "ruchika is good";
	if(S4.indexOf("good") != -1?true:false) {
		System.out.println("Pass");
	}
	System.out.println("Fail");
	
	char ch1[] = S4.toCharArray();
	char ch2[] = new char[ch1.length];
	for (int i=0; i<ch1.length; i++) {
		temp = (int) ch1[i];
		temp = temp-32;
		ch2[i] = (char) temp;
	}
	String s5 = new String (ch2); 
	System.out.println(ch1);
	System.out.println(ch2);

*/	
	/*	String s1 = "Ruchika";
	char ch[] = s1.toCharArray();
	StringBuffer sb = new StringBuffer();
	for (int i=s1.length()-1; i>=0; i--) {
		sb.append(ch[i]);
	}
	System.out.println(sb);
	
	String s2 = "This is me";
	String s3[] = s2.trim().split(" ");
	System.out.println(s3.length);
*/
	
	}

}
