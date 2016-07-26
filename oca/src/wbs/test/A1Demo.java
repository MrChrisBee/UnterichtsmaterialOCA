package wbs.test;

class A1 {
}

class B1 {
}

public class A1Demo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object o = new A1();
		A1 a1 = new A1();
		B1 b1 = new B1();
		System.out.println(o instanceof A1);
		System.out.println(o instanceof B1);
		// System.out.println(a1 instanceof B1);
	}
}