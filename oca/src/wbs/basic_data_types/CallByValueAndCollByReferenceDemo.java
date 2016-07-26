package wbs.basic_data_types;

import java.util.Arrays;

/*
 * Schreibe Code, der CallByValue und CallByReference nach den Regeln von Java illustriert.
 */
public class CallByValueAndCollByReferenceDemo {

	public static void main(String[] args) {
		int i = 17;
		int[] ii = { 1, 3, 4 };
		m1(i);
		System.out.println("Aus main(): in m1() wurde i auf 99 gesetzt, hier ist es wieder : " + i);
		m2(ii);
		System.out.println("Aus main(): in m2() wurde ii[2] auf 99 gesetzt, hier ist es nun : " + Arrays.toString(ii));
	}
  
	private static void m2(int[] ii) {
		System.out.println("Aus m2(): hier wurde eine Referenz übergeben: " + Arrays.toString(ii));
		ii[2] = 99;
	}

	private static void m1(int i) {
		System.out.println("Aus m1(): hier wurde ein Wert übergeben: " + i);
		i = 99;
	}

}
