package wbs.arrays_arraylist;

import java.util.Vector;

public class ArraysDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] a1;
		int a2[];
		// int a[3]; // compilerfehler 
		// beim Deklarieren darf man keinen Index angeben 
		a1 = new int[5];
		System.out.println(a1[0]); // 0
		// System.out.println(a1[5]); // Exception Ausserhalb des gültigen Bereichs

		a2 = a1;

		int[] a3 = { 1, 2, 3, 4, 5 };
		String[] a4 = { "blabla", "lalla", "gaga" };
		Object[] a5 = { "otto", new Integer(3), new Vector<String>(), a3, a4 }; // vlt. nur in Java möglich, def. nicht rechteckig
		System.out.println(a5[0]); // otto
		// System.out.println(a5[0].charAt(0)); // compilerfehler charAt ist eine 
		// Methode von String Referenztyp ist hier aber Objekt, vielleicht geht das :
		System.out.println("hier "+ ((String) a5[0]).charAt(0)); // durch den cast wird der Referenztyp auf String gesetzt jetzt klappts 
		System.out.println(a5.length); // 5 // wenn ich direkt auf den Array abfrage bekomme ich die erste Ebene

		int[][] b1 = { { 1 }, { 1, 2 }, { 1, 2, 3 } };
		for (int i = 0; i < b1.length; i++) {
			for (int j = 0; j < b1[i].length; j++) {
				System.out.print(b1[i][j] + " "); // 1 1 2 1 2 3
			}
		}
		System.out.println();
		b1[0] = a3;
		System.out.println(b1[0][4]); // 5
		a5[0] = b1;
		System.out.println(a5[0]); // [[I@10b62c9 // jetzt verweist a5[0] auf eine Array

		// a4 = a5; // compilerfehler // a4 ist ein Eindimensionales String Array
		a5 = a4;

		String s = new String(new char[] { 100, 101, 102 });
		System.out.println(s); // def

		String[] strings = new String[5];
		System.out.println(strings[2]); // null
		// System.out.println(strings[2].length()); // NullPointerException // ruf keine Methoden auf einem Objekt auf das null ist 
	}
}
