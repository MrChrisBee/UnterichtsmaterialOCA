package wbs.test;

interface I601 {
	void m();
}

public class C60 implements I601 {
	@Override
	public void m() {
		I601 i601 = new C60();
		String s = i601.toString();
		System.out.println(s);
	}
}