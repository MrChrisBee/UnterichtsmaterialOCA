package wbs.schleifen;

public class SimpleDoWhileDemo {
	/*
	 * wir geben alle ungeraden Zahlen zwischen 1 und 20 aus.
	 */
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i += 2;
		} while (i < 20);
	}

}
