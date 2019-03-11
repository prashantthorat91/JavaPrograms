package ivprograms;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str2="";
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0;i--) {
			System.out.println(ch[i]);
			str2= str2+ch[i];
		}
		System.out.println(str2);
		
	}
}
