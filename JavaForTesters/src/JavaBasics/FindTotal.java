package JavaBasics;

public class FindTotal {
	public static void main(String[] args) {
		/* int a[] = {2,4,6,8};
		int result[]; 
		
		AddNumbers addNum = new AddNumbers();
		result = addNum.twoSum(a, 12);
		System.out.println("The sum of numbers:");
		for(int i=0; i<4;i++)
			System.out.println(result[i]);
	*/
	
		AddWithoutPlusMinus addWPM = new AddWithoutPlusMinus();	
		System.out.println(addWPM.addingWithoutPlusMinus(-3,5));
	
		
	}
}
