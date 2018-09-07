
public class poly {
	public static void main(String[] args) {
		A c = new C();
		c.m1();
		
	}

}
class A{
	int a=23;{
		System.out.println(a);
	}
	static{
		System.out.println("inside static block of A");
	}
	
	void m1() {
		System.out.println("inside m1 of class A");
	}
	static void m2() {
		System.out.println("inside m2 of class A Static block");
	}
	void m3() {
		System.out.println("inside m3 of class A");
	}
	
	
	
}
class B extends A{
	void m1() {
		System.out.println("inside m1 of class B");
	}
	 static void m2() {
		System.out.println("inside m2 of class B Static block");
	}
	
	
}
class C extends B{
	void m1() {
		System.out.println("inside m1 of class C");
	}
	static void m2() {
		System.out.println("inside m2 of class C Static block");
	}
	
	
}