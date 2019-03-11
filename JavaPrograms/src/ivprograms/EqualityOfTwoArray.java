package ivprograms;

import java.util.Arrays;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		String[] str1 ={"1","2","3","4"};
		String[] str2 ={"1","3","2","4"};
		Boolean b = false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		
		if(b==Arrays.equals(str1, str2)) {
		//System.out.println(Arrays.equals(str1, str2));
		System.out.println("not equal");
		}else {
			System.out.println("equal");
		}
	}

}
