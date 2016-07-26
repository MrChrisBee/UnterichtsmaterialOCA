package wbs.test;

interface I8 {
	public void m();

	public void m(I8 i8);
}

public class A8Demo implements I8 {
	public static void main(String[] args) {
		new A8Demo().m();
		new A8Demo().m(new A8Demo());
	}

	@Override
	public void m() {
		System.out.println("A8Demo");
	}

	@Override
	public void m(I8 i8) {
		System.out.println(i8);
	}
}