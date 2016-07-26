package wbs.staticinit;

public class C {

	{ // Exemplarinitialisierer
		System.out.println("Nachricht vom Exemplarinitialisierer: Du hast eine neues Objekt von C erzeugt!");
	}
	static { // Statischer Intitialisierer
		System.out.println("mal sehen was da kommt");
	}

	public C() {
		System.out.println("Nachricht vom Konstruktor: Ihr habt mich erzeugt! C sagt danke! ");
	}
}
