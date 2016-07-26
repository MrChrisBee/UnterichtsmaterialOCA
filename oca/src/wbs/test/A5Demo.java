package wbs.test;

class A5 {
}

class B5 extends A5 {
}

class C5 {
	void m1(A5 a5) {
	}

	void m2(B5 b5) {
	}
}

public class A5Demo {
	public static void main(String[] args) {
		C5 c5 = new C5();
		A5 a5 = new A5();
		B5 b5 = new B5();
		c5.m1(a5);
		c5.m1(b5);
		c5.m2(b5);
		//c5.m2(a5); Compiler-Fehler
	}
}