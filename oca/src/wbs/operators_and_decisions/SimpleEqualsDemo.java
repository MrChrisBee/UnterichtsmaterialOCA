package wbs.operators_and_decisions;

public class SimpleEqualsDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(500);
		Integer i2 = new Integer(500);
		String s = "blabla";
		Long I = new Long(500);

		System.out.println(i1.equals(s)); 
		// Interger.equals() gibt nur true oder false sollte also hier false geben
		System.out.println(i2.equals(I)); // false
		
		System.out.println(i1.equals(i2));
		/*
		 *Um in Integer.equals() einen Vergleich durchzuführen muss Integer das Equals von Objekt überschreiben
		 *zur erfolgreichen Überschreibung muss die Methode mit der ursprünglichen Signatur genutzt werden
		 *also equals(Object) Um einen Vergleich anstellen zu können ist immer ein Cast in die neue Klasse notwendeig  
		 */

	}
}
