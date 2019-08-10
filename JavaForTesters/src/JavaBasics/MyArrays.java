package JavaBasics;
import java.util.*;

public class MyArrays {
	
	public static void main(String[] args) {
		
	//To stores multiple values of the same datatypes
	// index in array starts from 0
		int a[] = {1,2,4,5};
	
		int[] num1 = new int[10];
	//	int num2[] = new int[20];
		for(int i = 0; i<4; i++)
		System.out.println(a[i]);
//ArrayIndexOutOfBoundsException - problem with varible assignment or trying to access an index that does not exist
	
	String str[] = {"Array", "Basics","All" };
	for(int i = 0; i<3; i++)
		System.out.println(str[i]);
	System.out.println(num1.length);
	int num3[] = {700,45,344,654};
	System.out.println(num3.length);
	Arrays.sort(num3);
	for(int i = 0; i<4; i++)
		System.out.println(num3[i]);
	
	}
}
