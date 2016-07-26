package wbs.test;

interface I6 {
	public String m();
}

class A6 implements I6 {
	@Override
	public String m() {
		return "a6";
	}
}

class B6 implements I6 {
	@Override
	public String m() {
		return "b6";
	}
}

class C6 {
	void m(I6 i6) {
		System.out.println(i6.m());
	}
}

public class A6Demo {
	public static void main(String[] args) {
		A6 a6 = new A6();
		B6 b6 = new B6();
		C6 c6 = new C6();
	//	I6 i6 = new A6(); von mir zum test
		c6.m(a6);
		c6.m(b6);
	//	c6.m(i6);   klappt so auch ???
	}
}