package wbs.operators_and_decisions;

class Base {
	int n = 2;

	void m() {
		System.out.println("m von Base");
	}

	static void m2() {
		System.out.println("m2 von Base");
	}
}

class Sub extends Base {
	int n = 3;

	@Override
	void m() {
		System.out.println("m von Sub");
	}

	// bei Statischen Methoden spricht man nicht von Overriding sondern eher von
	// redefining
	static void m2() {
		System.out.println("m2 von Sub");
	}

	void m(int n) {
		System.out.println("m(int) von Sub");
	}
}

public class CastDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Base base = new Sub();
		// beim Zugriff auf Felder entscheidet der Referenztyp
		System.out.println(base.n); // 2 !!!!!!
		// beim Aufruf nicht Statischer Methoden entscheidet der Objekttyp
		base.m(); // m von Sub
		// beim Aufruf statischer Methoden entscheidet der Referenztyp
		// es ist unschön aber erlaubt statische Methoden über Objektreferenzen
		// aufzurufen
		base.m2();
		// der Compiler wird nur den Zugriff auf die Member einer Klasse
		// gestatten die zum Referenztyp gehören
		// base.m(3); Compilerfehler

		// ein cast ändert den Referenztyp aber niemals den Objekttyp
		// der folgende Aufruf klappt weil der Compiler nun Sub als Referenztyp
		// sieht und in Sub ist die Methode vorhanden
		((Sub) base).m(3);
		System.out.println(base.n);
		System.out.println(((Sub)base).n);
		
		//ein Cast ändert den Objekt-type N I C H T
		((Base) base).m(); // immer noch m() von Sub

		// beim Casten gibt es 3 mögliche Ergebnisse
		// 1. Erfolg
		CharSequence cs = "blabla"; // RT CharSequenz OT StringLiteral 
		//String IS A CharSequence also steht einem Cast nichts mehr im Wege
		String s = (String) cs;
		System.out.println(s);
		
		// 2. ClassCastException
		System.out.println(cs.getClass());
		try {
			StringBuffer sb = (StringBuffer) cs;
			// es könnte sein das zur Laufzeit cs ein StringBuffer objekt enthält 
			// es ist aber nicht so
			System.out.println(sb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. CompilerFehler
		@SuppressWarnings("unused")
		Integer zahl = Integer.valueOf(12345);
		// s = (String) zahl;
		
		
		
	}

}
