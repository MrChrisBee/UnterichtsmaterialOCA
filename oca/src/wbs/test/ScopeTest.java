package wbs.test;

public class ScopeTest {
	int z;

	public static void main(String[] args) {
		ScopeTest myScope = new ScopeTest();
		int z = 6;
		System.out.println(z);
		myScope.doStuff();
		System.out.println(z);
		System.out.println(myScope.z);
	}

	void doStuff() {
		int z = 5;
		doStuff2();
		System.out.println(z);
	}

	void doStuff2() {
		z = 4;
	}
}