package wbs.test;

class A7 {
}

class B7 extends A7 {
	public String toString() {
		return "b7";
	}
}

public class A7Demo {
	public static void main(String[] args) {
		Object o;
		A7 a7 = new A7();
		B7 b7 = new B7();
		System.out.println(a7);
		System.out.println(b7);
		o = a7 = b7;
		System.out.println(o);
	}
}