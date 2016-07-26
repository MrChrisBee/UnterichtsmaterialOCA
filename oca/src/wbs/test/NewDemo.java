package wbs.test;

import java.util.Stack;
import java.util.Vector;

public class NewDemo {
	public static void main(String[] args) {
		//AbstractList al = new AbstractList(); // compilerfehler
		/*
		 * die Klasse heißt nicht nur Abstract sie ist es auch,
		 * um eine Referenz vom Typ AbstractList zu erzeugen
		 * darf der rechte teil nicht Abstract sein
		 * = new ArrayList(); ginge z.B.  
		*/
		
		// Collection c = new Collection(); // compilerfehler
		/*
		 * Collection ist ein Interface, new Collection()
		 * ist also nicht gültig,
		 */
		
		// Math math = new Math(); // compilerfehler
		/*
		 * kein öffentlicher construktor für Math vorhanden
		 */
		
		// Integer n = new Integer(); // compilerfehler
		/*
		 * Integer hat keinen parameterlosen Konstruktor 
		 */
		
		// Stack stack = new Vector(); // compilerfehler
		/*
		 * Vector ist nicht subklasse von Stack sondern umgekehrt
		 */
		
		Integer n = new Integer(3); // ok
		Vector<Integer> vector = new Stack<Integer>(); // ok
		vector.add(n);
	}
}