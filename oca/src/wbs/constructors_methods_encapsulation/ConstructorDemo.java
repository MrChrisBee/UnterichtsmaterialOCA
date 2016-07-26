package wbs.constructors_methods_encapsulation;

/*
 * Wir untersuchen was passiert wenn Konstruktoren einer Klasse sich wechselseitig aufrufen
 */
class C1 {
	C1() {
		// this(" "); //Erzeugt eine Kopilerfehler : Recursiv constructor
		// invocation C1(int)
	}

	C1(int test) {
		this();
	}

	C1(String s) {
		this(1);
	}
};

/*
 * Wir untersuchen ob der Kompiler überprüft das jeder Konstruktor einer Klasse jedes
 * nicht Statische final- Field, das nicht bereits bei seiner Deklaration initialisiert
 * wurde, initialisiert.
 */

class C2 {
	final int i;

	C2() {
		i = 15;
	}

	// C2(int j) { //hier wird i nicht initialisiert -> Kompilerfehler
	//
	// }

	C2(String s) {
		this(); // hier wird festgestellt das die Initialisierung von i im
				// parameterlosen Konstruktor erfolgt
	}
}

/*
 * Was passiert wenn der Konstruktor einer Basisklasse eine Methode aufruft die in der Subklasse 
 * überschrieben wurde und eine Instanz der Subklasse erzeugt wird?
 * These: ich denke das es keine Compiler sondern einen Laufzeitfehler gibt
 * wenn eine Instanz der SubKlasse erzeugt wird (implizit Aufruf der Basisklasse) verlangt 
 * die Basisklasse nach einer Methode die es noch nicht geben kann
 * These war FALSCH!!!
 *  
 */

class C3Base {
	int n = 1;

	C3Base() {
		m();
	} // rufe hier nichts was in abgeleiteten Klassen noch überschreiben werden
		// kann

	void m() {
		System.out.println("In C3base mit n = " + n);
	}
}

class C3Sub extends C3Base {
	C3Sub() {
		n = 2;
	}

	@Override
	void m() {
		System.out.println("In C3Sub mit n = " + n);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		C3Sub c3s = new C3Sub(); // Objekt und Referenztyp sind beide C3Sub also
									// muss ich deren m nutzen
		// wenn Super nur als erste Anweisung genutzt werden darf wird
		// wahrscheinlich auch der implizierte
		// Aufruf des Konstruktors der Basisklasse zuerst gemacht, n ist noch
		// nicht Initialisiert also 0 ?
		c3s.m();
	}

}
