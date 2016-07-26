package wbs.basic_data_types;

import java.util.Vector;

public class AutoboxingDemo {
	public static void main(String[] args) {
		Integer i11 = new Integer(100);
		Integer i12 = new Integer(100);
		// autoboxing 
		// das int literal 100 wird automatisch (durch den Compiler) automatisch in einen Integer umgewandelt
		// implizit wird hier Integer.valueOf() aufgerufen
		Integer i21 = 100; 
		Integer i22 = 100;
		// Integer verwaltet intern einen cache für die Werte von -128 bis 127
		// für Werte im obigen Bereich liefert die methode valueOf() referenzen auf Werte aus dem
		// internen cache
		Integer i31 = Integer.valueOf(100);
		Integer i32 = Integer.valueOf(100);
		Integer i41 = 200;
		Integer i42 = 200;
		Integer i51 = Integer.valueOf(200);
		Integer i52 = Integer.valueOf(200);
		System.out.print("i11 == i12   :" );
		System.out.println(i11 == i12); // false !
		System.out.print("i21 == i22   :"); 
		System.out.println(i21 == i22); // true !
		System.out.print("i31 == i32   :"); // true !
		System.out.println(i31 == i32); // true !
		System.out.print("i41 == i42   :");
		System.out.println(i41 == i42); // false !
		System.out.print("i51 == i52   :");
		System.out.println(i51 == i52); // false !

		// Typ Parameter generischer Typen dürfen keine primitiven Typen sein
		// Vector<int> iv; .. Kompiler Fehler
		Vector<Integer> v = new Vector<Integer>();
		// autoboxing
		v.add(100);
		// autounboxing
		// implizit wird zur Umwandlung von Integer nach int 
		// die Methode intValue() der Klasse Integer aufgerufen
		int n = v.get(0);
		System.out.println(n);
	}
} 