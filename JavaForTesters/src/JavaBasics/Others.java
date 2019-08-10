package JavaBasics;

public class Others {

	public static void main(String args[]) {
		int a=10;
		Integer wrapA = a; //autoboxing
		System.out.println(wrapA);
		Integer wrapB = Integer.valueOf(a);
		System.out.println(wrapB); 
		
		Integer i = new Integer(20);
		int j = i; //unboxing
		int k = i.intValue();
		
	}
}
