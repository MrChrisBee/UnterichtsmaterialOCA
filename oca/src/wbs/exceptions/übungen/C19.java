package wbs.exceptions.übungen;

class C191 {
	void m() throws Throwable {
		throw new Throwable();
	}
}

public class C19 {
	public static void main(String[] args) throws Throwable {
		new C191().m();
	}
}