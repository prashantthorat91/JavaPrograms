package ivprograms;

import java.util.Iterator;
import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0;i--) {
			System.out.println(ch[i]);
		}
		
	}
}
