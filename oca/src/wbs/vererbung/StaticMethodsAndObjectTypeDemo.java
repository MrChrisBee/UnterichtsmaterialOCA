package wbs.vererbung;

class A1 {
	static void m() {
		System.out.println("Aus A1");
	}
	
}
class A12 extends A1 {
	static void m() {
		System.out.println("Aus A12");
	}
	
}

public class StaticMethodsAndObjectTypeDemo {
	/*
	 * Wir Illustrieren folgenden Sachverhalt
	 * Statische Methoden können in abgeleiteten Klassen anders implementiert werden als in der
	 * 	Basisklasse, sind aber nicht polymorph, d.h. beim Aufruf einer statischen Methode über eine
	 * 	Referenzvariable (was erlaubt, aber nicht empfehlenswert ist) entscheidet der deklarierte
	 * 	Typ der Referenzvariablen (reference type) und nicht der Laufzeittyp (object type) über die
	 * 	Wahl der Methodenimplementierung.
	 */

	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		A1 z = new A12();	
		z.m(); // es geht nach dem Referenztype nicht wie üblich nach dem Objekttyp  -> Aus A1
		}

}
