package wbs.arrays_arraylist;

public class FibonacciDemo {
	/*
	 * Wir bestücken ein Long Array mit 
	 * den ersten 50 Fibonacci Zahlen
	 * Die ersten beiden Elemente sind 1 
	 * und jedes folgende Element ist die Summe 
	 * der beiden vorhergehenden Elemente
	 */
	public static void main(String[] args) {
		Long[] fibonacci = new Long[50];
		fibonacci[0] = 1l;
		fibonacci[1] = 1l;
		for (int i = 2; i < 50; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		int j = Long.toString(fibonacci[49]).length();
		String addme = " ";

		for (Long fibs : fibonacci) {
			for (int i = 0; i < (j -Long.toString(fibs).length()); i++)
				addme += " ";
			System.out.print(fibs + addme);
			addme = "";
			j++;
			if (j % 3 == 0)
				System.out.println();
		}
	}
}
