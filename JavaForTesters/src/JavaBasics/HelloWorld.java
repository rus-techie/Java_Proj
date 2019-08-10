package JavaBasics;


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello");
//Strings created by using a string literal is stored in the String constant pool
//String functions - length, subString, concat, charAt, indexOf,toUpperCase, toLowerCase, trim, replace, equals, contains 	
		
		//These 2 differ in the memory allocation. The first one is a smarter way
		//String is a class in java.		
String str1 = " I am a String Literal that is stored in the String constant Pool!     ";
		
		//Strings can also be created as objects.It is stored in heap storage
String str2 = new String();
str2 = " I am a String object that is stored in the heap!   ";
System.out.println(str1);
System.out.println(str1.length());

System.out.println(str2);
System.out.println(str2.length());
String str3 = str1.trim();
System.out.println(str3.length());

System.out.println(str2.indexOf("String")); 
//concat
String con = str1.concat(str2);
System.out.println(con);
System.out.println(str3+str2);
System.out.println(str3.replace("Literal", "Trimmed"));

System.out.println(str1.trim().equals(str3));
System.out.println(str1.contains("Literal"));

System.out.println(str1.length());
System.out.println(str1.toUpperCase());
System.out.println(str2.toLowerCase());
System.out.println(str2.substring(0, 1));

System.out.println(str2.charAt(7));
System.out.println(str2.indexOf("String"));


	}
	
}
