package wbs.operators_and_decisions;

public class KonditionalOperatorDemo {

	public static void main(String[] args) {
		/*
		 * wir ermitteln zwei Zufallszahlen zwischen 0 und 1 und nennen sie x
		 * und y für das erzeugen der Zufallszahlen verwenden wir die Methode
		 * random der Klasse Math
		 * 
		 * wir geben aus: x ist kleiner als Y oder x ist nicht kleiner als y
		 */
		double x = Math.random();
		double y = Math.random();

		System.out.println((x < y ? "x ist kleiner als Y"
				: "x ist nicht kleiner als Y"));
		
		if (x < y) {
			System.out.println("x ist kleiner als Y");
		} else {
			System.out.println("x ist nicht kleiner als Y");
		};
	}

}
