package JavaBasics;

public class AddWithoutPlusMinus {
	
	public int addingWithoutPlusMinus(int a, int b) {
		int sum  = 0;
		sum = Math.addExact(a, b);
		return sum;
	}

}
