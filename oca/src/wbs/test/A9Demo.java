package wbs.test;

class A9 {
}

interface I9 {
}

public class A9Demo extends A9 implements I9 {
	public static void main(String[] args) {
		Object o = new A9Demo();
		System.out.println(o instanceof I9);
		System.out.println(o instanceof A9);
		System.out.println(o instanceof A9Demo);
		System.out.println(o instanceof String);
		A9Demo a9Demo = new A9Demo();
		System.out.println(a9Demo instanceof I9);
		System.out.println(a9Demo instanceof A9);
		System.out.println(a9Demo instanceof A9Demo);
		// System.out.println(a9Demo instanceof String);
	}
}