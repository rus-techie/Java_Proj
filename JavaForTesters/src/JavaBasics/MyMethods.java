package JavaBasics;

public class MyMethods {

	public void mymethod() {
		System.out.println("My first function");
	}
	
	//access modifier(public, private protected) returntype MethodName(input parameters)
	public static void main (String[] args) {
		MyMethods myMeth = new MyMethods();
		myMeth.mymethod();

	Cars myCar = new Cars();
	myCar.setColor("Blue");
	System.out.println("My cars color is " + myCar.getColor());
	
	Cars myCar2 = new Cars("BMW","red");
	System.out.println("My cars color is " + myCar2.getColor());
	}
	
}
