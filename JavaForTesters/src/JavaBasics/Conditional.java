package JavaBasics;

public class Conditional {

	public static void main(String[] abc)
	{
		boolean a = true;
		String str = "Ruchika";
		if(a)
			{
			System.out.println("This is true");
			
			if(str.equalsIgnoreCase("ruchika"))
				System.out.println("correct name");
			else
				System.out.println("Incorrect name");
			}
		else
			System.out.println("false");
	}
	
}
