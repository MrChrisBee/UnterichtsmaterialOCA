package wbs.constructors_methods_encapsulation;

/*
* Wir provozieren einen Kompiler-Fehler durch den mehrdeutigen Aufruf 
* einer mehrfach überladenen Methode 
*/

public class OverloadDemo {

	public static void main(String[] args) {
		
		m();
		m(1);
		m(Integer.valueOf(1));
		//m("sdfs");
	}

	private static void m() {
		System.out.println("aus der Parameterlosen");
	}
	private static void m(int i) {
		System.out.println("aus mit int");
	}
	private static void m(Integer i) {
		System.out.println("aus mit Integer");
	}
	
}
