package wbs.schleifen;

public class LabelesLoopDemo {
	/*
	 * wir geben von jedem Aufrufargument 
	 * alle Zeichen bis zur ersten Ziffer aus
	 * Erzeuge verschiedene Varianten
	 * 
	 * 
	 * eins
	 * zwe1rt
	 * d3ewe
	 * 
	 * Ausgabe: 
	 * eins
	 * zwe
	 * d
	 * 
	 */
	public static void main(String[] args) {
		// jedes aufrufarbument
		for (String s : args) {
			int index = 0;
			while (index < s.length()
					&& Character.isAlphabetic(s.charAt(index))) {
				System.out.print(s.charAt(index));
				index++;
			}
			System.out.println();
		}
		System.out.println("*********das war die erste ******");
		for (String s : args) {
			sprungmarke: for (Character c : s.toCharArray()) {
				if (!Character.isAlphabetic(c))
					break sprungmarke;
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("*********das war die zweite ******");
	}
}
