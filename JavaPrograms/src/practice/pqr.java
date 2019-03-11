package practice;
import java.util.Scanner;


public class pqr {
	
	public Object m1(Object s) {
		System.out.println("Object method");
		return null;
	}
	public void m1(String a) {
		System.out.println("String method");
	}

	public static void main(String[] args){
		
		pqr q = new pqr();
		q.m1(2);
		pqr p = new xyz();
		p.m1(3);
		xyz z = new xyz();
		z.m1(4);
		
	}
}
class xyz extends pqr{
	
	public String m1(int s) {
		final int a = 76;
		System.out.println("inside xyz string");
		return null;
		
	}
}




	

