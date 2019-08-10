package JavaBasics;

import java.util.Scanner;

public class StringBufferReversal {
	
	public static void main(String[] agrs) {
		/*
		StringBuffer strBuffer = new StringBuffer();
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();
		for (int i=str.length()-1;i>=0;i--) {
			strBuffer = strBuffer.append(str.charAt(i));
		}
		String reversedStr = strBuffer.toString();
		System.out.println(strBuffer);
		if (str.equals(reversedStr))
			System.out.println("Plaindrome");
		else
			System.out.println("Not a palindrome");
	
	
			String s1 = "Ruchika";
		char ch[] = s1.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i=s1.length()-1; i>=0; i--) {
			sb.append(ch[i]);
		}
		System.out.println(sb);
	*/	
	
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();
		
		String[] str1 = str.trim().split(" ");
		int len = str1.length;
		String[] str2 = new String[len];
		for (int i=len-1, j=0; i>=0 && j<len; j++,i--) {
			str2[j] = str1[i];
	}
		for (String a: str2) {
			System.out.println(a);
		}
	
	}

}
