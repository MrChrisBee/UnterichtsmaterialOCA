package wbs.operators_and_decisions;

import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class InstanceOfDemo2 {
	public static void main(String[] args) {
		Vector<?> v = new Vector<>();
		AbstractList<?> al = new LinkedList<>();
		System.out.println(v instanceof AbstractList); // true
		// Vector is a AbstractList
		System.out.println(v instanceof List); // true
		// Vector is a List (als Implementiertes Interface)
		System.out.println(v instanceof Collection); // true
		// Vector is a Collection (als Implementiertes Interface)
		System.out.println(v instanceof Object); // true
		// Alles is a Object
		
		// System.out.println(v instanceof String); // Compilerfehler
		// v ist kein String und da String als final deklariert wurde kann
		// v auch niemals etwas daraus abgeleitetes werden ergo Kompiler-Fehler
		System.out.println(al instanceof LinkedList); // true
		// al IS A LinkedList
		al = v;
		System.out.println(al instanceof LinkedList); // false
		// al ist jetzt vom ObjektType Vector al ist kein LinkedList
	}
}