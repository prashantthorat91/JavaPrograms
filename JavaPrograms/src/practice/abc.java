package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class abc {
	 public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.nextLine();
	String[] st = str.split(" ");
	List list = new ArrayList();
	for(int i=0; i<st.length;i++) {
		if(st[i].equals("java")) {
			list.add(st[i]);
		}
		
	}
	System.out.println(list.size());
	
	 } 
}



