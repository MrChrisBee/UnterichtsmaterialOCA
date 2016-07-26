package wbs.exceptions.übungen;

@SuppressWarnings("serial")
class E1 extends Exception {
}

@SuppressWarnings("serial")
class E2 extends Exception {
}

public class C13 {
	public void m() throws E1, E2 {
		try {
			if (Math.random() > 0.5) {
				throw new E1();
			} else {
				throw new E2();
			}
		} catch (Exception e) {
			throw e;
		}
	}
}