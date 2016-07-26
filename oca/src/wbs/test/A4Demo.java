package wbs.test;

class A4 {
	void m(CharSequence cs) {
	}
}

public class A4Demo {
	public static void main(String[] args) {
		A4 a4 = new A4();
		a4.m("blabla");
		a4.m(new StringBuffer("abc"));
		a4.m(new StringBuilder("blabla"));
		a4.m(new StringBuilder(new StringBuffer(new String("lalla"))));
	}
}