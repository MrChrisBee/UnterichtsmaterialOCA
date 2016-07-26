package wbs.arrays_arraylist;

public class QuadrateDemo {
	/*
	 * Wir bestücken ein eindimensionales IntArray mit den ersten 10 Quadratzahlen.
	 * 
	 * 1. mit einer Initialisierungsliste
	 * 2. mit einer Schleife
	 * 
	 * dann geben wir beide Arrays aus
	 * 
	 */
	public static void main(String[] args) {
		int qd1[] = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };
		Integer qd2[] = new Integer[10];
		for (int j = 1; j <= 10; j++) {
			qd2[j - 1] = j * j;
		}
		int j = 0;
		for (int i : qd1) {
			System.out.println(i + "\t\t" + qd2[j++]);
		}
	}
}
