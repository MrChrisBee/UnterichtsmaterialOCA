package wbs.vererbung;

class Base2 {
	void m() {
		System.out.println("in m() von Base");
	}
}

class Sub_1 extends Base2 {
	@Override
	void m() {
		System.out.println("in m() von Sub_1");
	}
}

class Sub_2 extends Base2 {
	@Override
	void m() {
		System.out.println("in m() von Sub_2");
	}
}

public class PolymorphismusDemo {
	public static void main(String[] args) {
		// ternärer Operator oder Conditional Operator
		Base2 b = Math.random() < 0.5 ? new Sub_1() : new Sub_2();
		b.m();
		
	}
}