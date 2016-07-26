package wbs.operators_and_decisions;

import java.util.Random;

public class KonditionalOperator2Demo {

	public static void main(String[] args) {
		/*
		 * zwei ganzzahlige Zufallszahlen zwischen 1 und 10 unter verwendung der
		 * Klasse Random aus dem Package
		 * 
		 * wir geben aus ob die erste größer, kleiner oder gleich der zweiten
		 * Zahl ist
		 */
		Random zuzahl = new Random();

		int x = zuzahl.nextInt(10) + 1;
		int y = zuzahl.nextInt(10) + 1;
		System.out.println(x);
		System.out.println(y);

		if (x > y) {
			System.out.println("x ist größer als y");
		} else if (x == y) {
			System.out.println("x ist gleich y");
		} else {
			System.out.println("x ist kleiner als y");
		}
		System.out.println((x<y)?"x ist kleiner als y":(x==y)?"x ist gleich y":"x ist größer als y" );

	}
}
