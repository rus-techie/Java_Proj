package JavaBasics;

public class stringSort {
	
	public static void sortStr(String s) {
		int min,len = s.length();
		char[] ch = s.toCharArray();
		//sort
		for (int i=0; i<len-1;i++) {
			min = i;
			for (int j=i+1;j<len;j++){
				if(ch[min]>ch[j]) {
					min = j;
				}
			}
			//swap
			char temp = ch[i];
			ch[i] = ch[min];
			ch[min] = temp;
		}
		String S = new String (ch);
		System.out.println("Sorted string "+S);
	}
		
	public static void main(String[] args){
		String s = "apple";
		sortStr(s);
	}

}
