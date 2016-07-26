package wbs.operators_and_decisions;

public class GleichGleichDemo {

	public static void main(String[] args) {
		/*
		 * Was liefert der Operator ==, wenn das ergebnis true unmöglich ist?
		 * einen Compiler-Fehler System.out.println(1 == new String("1"));
		 * liefert z.B. Incompatible operand types int and String
		 * 
		 * Was liefert der Operator !=, wenn das Ergebnis false unmöglich ist?
		 * einen Compiler-Fehler
		 * 
		 * Welcher Zusammenhang besteht zwischen equals() in der Klasse Objekt
		 * und ==
		 */

		String s = "abc";
		StringBuffer sb = new StringBuffer("abc");

		// System.out.println(s == sb); auch hier wieder incompatible operand
		// types
		// System.out.println(s != sb);auch hier wieder incompatible operand
		// types

		System.out.println(sb.equals(s));
		System.out.println(s.equals(sb.toString()));

		System.out.println("++++++++++++++++++++++++++++++++++++");
		String s11 = "abc";
		String s12 = "abc";
		String s21 = new String("abc");
		String s22 = new String("abc");
		// StringBuffer können modifiziert werden irgendwie erscheint mir das
		// wichtig
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println(s11 == s12); // true Gleichheit der Objekte wegen
										// Zuweisung des Stringinhalts über ein
										// Literal, in diesem Fall verweist der
										// Bezeichner auf ein Objekt im
										// Stringpool das in beiden Fällen das
										// Gleiche Objekt ist

		System.out.println(s11.equals(s12)); // true nutzt die String
												// Überschreibung von Equals()
												// die einen Wertevergleich
												// durchführt

		System.out.println(s21 == s22); // false die neue erzeugten Objekte
										// liegen nicht im gleichen
										// Speicherbereich

		System.out.println(s21.equals(s22)); // true String überschreibt Equals
												// und gibt nur dann true wenn
												// es sich um den selben Inhalt
												// und nicht um einen Verweis
												// auf Null handelt

		System.out.println(sb1 == sb2); // false

		System.out.println(sb1.equals(sb2)); // true FALSCHE Prognose hier kommt
												// False heraus StringBuffer
												// nutzt equals() aus Objekt und
												// das gibt nur dann true wenn
												// es sich um das gleiche Objekt
												// handelt

	}

}
