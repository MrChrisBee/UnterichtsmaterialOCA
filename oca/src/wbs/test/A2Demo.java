package wbs.test;

interface I5 {
}

class B21 {
}

final class B22 {
}

public class A2Demo {	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B21 b21 = new B21();
		B22 b22 = new B22();
		System.out.println(b21 instanceof I5);
		// System.out.println(b22 instanceof I2);
	}
}