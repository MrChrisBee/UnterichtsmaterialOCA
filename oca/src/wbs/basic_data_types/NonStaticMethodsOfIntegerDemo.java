package wbs.basic_data_types;

public class NonStaticMethodsOfIntegerDemo {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*
		 * wir illustrieren einige nicht statische methoden der klasse
		 * Integer
		 * 
		 * bei nicht statischen methoden ist das ergebnis des methodenaufrufs abhängig
		 * von dem objekt, für das die methode aufgerufen wird.
		 * i1.intValue() liefert etwas anderes als i2.intValue() !!!
		 * i1.compareTo(i2) liefert etwas anderes als i2.compareTo(i1) !!!
		 */
		Integer i1 = new Integer(123);
		Integer i2 = new Integer("456");
		int zahl;
		int n;
		int diff;
		
		n = i1.intValue();
		System.out.println(n);  // 123
		
		n = i2.intValue();
		System.out.println(n);  // 456
		
		diff = i1.compareTo(i2);
		System.out.println(diff);  // -1
		
		diff = i2.compareTo(i1);
		System.out.println(diff);  // 1
		
		// bei statischen methoden ist das ergebnis dagegen unabhängig
		// von dem objekt, für das sie aufgerufen werden !!!
		// bitCount(31) liefert denselben wert, egal ob für i1 oder für i2 aufgerufen !!!
		// es gilt daher als "unfein", statische methoden über objekt-referenzen aufzurufen,
		// und wird vom compiler mit einer warning quittiert
		// (falls kein @SuppressWarnings("static-access"))
		zahl = i1.bitCount(31);
		System.out.println(zahl);  // 5
		zahl = i2.bitCount(31);
		System.out.println(zahl);  // 5
		System.out.printf("%.2f", 3.1415927);
	}

}
