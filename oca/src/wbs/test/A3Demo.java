package wbs.test;

interface I3 {
	public void m();
}

class A3 implements I3 {
	@Override
	public void m() {
	}

	public void ma() {
	}
}

class B3 implements I3 {
	@Override
	public void m() {
	}

	public void mb() {
	}
}

public class A3Demo {
	public static void main(String[] args) {
		A3 a3 = new A3();
		B3 b3 = new B3();
		a3.m();
		a3.ma();
		I3 i3 = a3;
		i3.m();
		i3 = b3;
		i3.m();
		a3.ma();
		b3.mb();
	//	i3.mb();
	}
}