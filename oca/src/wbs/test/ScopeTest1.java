package wbs.test;

public class ScopeTest1 {
	public static void main(String[] args) {
		doStuff(); // line x1 kein CompilerFehler 
		// int x1 = x2; // line x2 x2 ist hier noch nicht initialisiert
		@SuppressWarnings("unused")
		int x2 = j; // line x3
	}

	static void doStuff() {
		System.out.println(j); // line x4
	}

	static int j;
}
