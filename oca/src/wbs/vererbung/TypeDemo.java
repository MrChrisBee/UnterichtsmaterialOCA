package wbs.vererbung;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class TypeDemo {

	/*
	 * Object Type / Reference Type Ein- und dasselbe Objekt kann in der Regel
	 * über eine Vielzahl von Typen angesprochen werden. Der Object-Type eines
	 * Objektes ist die Klasse, die instanziiert wurde. Als Reference- Type ist
	 * jeder Typ zulässig, der einer direkten oder indirekten Basisklasse der
	 * Klasse des Objektes entspricht, oder einem Interface, das von der Klasse
	 * des Objekts oder irgendeiner ihrer Basisklassen implementiert wird.
	 * 
	 * Ob eine Methode aufgerufen werden kann entscheidet der Referenz-Typ des
	 * Objektes zur Compile-Zeit welche Methode nun gewählt wird (Vererbung) 
	 * entscheidet der Referenz-Typ
	 * 
	 * Object Type = Runtime Class
	 */
	public static void main(String[] args) {
		// object-type von iList
		ArrayList<Integer> iList = new ArrayList<>();
		// alle reference-types von iList
		System.out.println(iList instanceof ArrayList);
		System.out.println(iList instanceof AbstractList);
		System.out.println(iList instanceof AbstractCollection);
		System.out.println(iList instanceof Object);
		System.out.println(iList instanceof List);
		System.out.println(iList instanceof Collection);
		System.out.println(iList instanceof Iterable);
		System.out.println(iList instanceof RandomAccess);
		System.out.println(iList instanceof Cloneable);
		System.out.println(iList instanceof Serializable);
	}
}