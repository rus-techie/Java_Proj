package JavaBasics;

class reversingString2{
	
	public String revString2(String S, int max){
		char[] revArr = new char[S.length()];
		char[] arr = S.toCharArray();
		for (int i=max-1, j=0; i>=0; i--, j++) {
			revArr[j] = arr[i];
		}
		for (int k=max; k<S.length(); k++) {
			revArr[k] = arr[k];
		}
		String revStr = new String(revArr);
		return revStr;
	}
	
}

public class ReverseString2 {
	
	public static void main(String[] args) {
		reversingString2 obj = new reversingString2();
		String Str = "abcdefg";
		int x = 2;
		System.out.println("The reversed string is: " + obj.revString2(Str, x));
	}

}
