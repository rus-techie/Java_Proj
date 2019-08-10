package JavaBasics;

class ReverseString{
	
	public String reverseStringFunc(String str) {
		String newString;
		char[] arr = str.toCharArray();
		int max=str.length();
		char[]revArr=new char[max];
		
		for(int i=0, j=max-1; j>=0; i++,j--) {
			revArr[i] = arr[j];
			
		}
		
		for(int k=0;k<max-1; k++) {
		System.out.print(revArr[k]);
		}
		
		newString = arr.toString();
		return newString;
	}
}

public class StriingReversal {
	public static void main(String[] args) {
		String str = "AWESOME";
		ReverseString obj = new ReverseString();
		System.out.println("\n The reverse of the string is: "+obj.reverseStringFunc(str));
	}

}
