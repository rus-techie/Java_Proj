package JavaBasics;

public class StringToLowerCase {

	public static String toLowerCase(String strEntered)
	{
	String newString = new String();
	int strLen = strEntered.length();
	char result[] = new char[strLen];
	char c[] = new char[strLen];
	
	//Converting String to char array
	for(int j=0;j<strLen;j++)
		c[j] = strEntered.charAt(j);
	
	//Converting lower to lower case	
	for (int i=0;i<strLen;i++) {	
		if(c[i]>=65 && c[i]<=90)
			result[i] = (char)(c[i]+32);
		else
			result[i] = (char)(c[i]);
		}
	
	//Converting char array to string
	for (int k=0;k<strLen;k++) {
		newString = newString + result[k];
		}
	return newString;
	}

public static void main(String[] args) {
	String str = "I AM THE Best";
	System.out.println("The initial string is: "+str);
	System.out.println("The converted String is: "+ toLowerCase(str));
}
	
	
	
/*	public static char[] toLowerCase(String strEntered)
		{
		int strLen = strEntered.length();
		char result[] = new char[strLen];
		char c[] = new char[strLen];
		for(int j=0;j<strLen;j++)
			c[j] = strEntered.charAt(j);
		
		//Converting lower to upper case	
		for (int i=0;i<strLen;i++) {	
			if(c[i]>=97 && c[i]<=122)
				result[i] = (char)(c[i]-32);
			else
				result[i] = (char)(c[i]);
		
			System.out.print(result[i]);
			}
		return result;
		}
	
	public static void main(String[] args) {
		String str = "ruchika is the Best";
		String newString = new String();
		char resultStr[] = toLowerCase(str);
		System.out.print("\n The converted string is: " );
		for (int k=0;k<str.length();k++) {
		System.out.print(resultStr[k]);
		
		

		
		newString = newString + resultStr[k];
		
	}
		System.out.println("\n \n This is a string: "+newString);
}
*/	
}