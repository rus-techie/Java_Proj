package JavaBasics;

public class myStrings {
	
	public static void main(String[] args){
	
	int a[] = new int[2];
	a[0]=10;
	a[1]=100;	
	System.out.println(a[0]==a[1]);
	String s = "abcde";
	String s1 = new String("abcde");
	char ch[] = {'a','b','c','d','e'};
	String s2 = new String (ch); //array to string
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1==s);
	System.out.println(s1==s2);
	
	System.out.println(s1.equals(s2));
	System.out.println(s.equals(s2));
	
	//String hugdfaxc[] = new String[4];
	//int intArr[] = new int[1];
	
	// Object arr[] = new Object[5];
	
	
	
	}
}
