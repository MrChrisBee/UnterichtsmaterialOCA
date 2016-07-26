package wbs.arrays_arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


class AbstandVomMittelwertComperator implements Comparator<Integer> {


	@Override
	public int compare(Integer o1, Integer o2) {
		return Math.abs(MittelwertDemo.mittelwert -o1) - Math.abs(MittelwertDemo.mittelwert -o2);
	}
	
}

public class MittelwertDemo {
	static int mittelwert = 0;
	/*
	 * Wir bestücken ein 100 - elementiges Array von Integer mit
	 * Zufallszahlen zwischen 1 und 1000 und Berrechnen den Mittelwert
	 *  
	 * Wir sortieren das Array nach dem Abstand vom Mittelwert
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		int zahl = 0;
		Integer[] zufallsZahlen =   new Integer[100]; 
		System.out.println("Durcheinander :");
		for(int i = 0; i< 100; i++) {
			zahl = rnd.nextInt(1000) +1; 
			zufallsZahlen[i] = zahl;  
			mittelwert += zahl;
			System.out.print(zahl + " ");
			if ((i+1) % 10 == 0) System.out.println();
		}
		System.out.println();
		System.out.println("Der Mittelwert ist " + (mittelwert = mittelwert / 100));
		Arrays.sort(zufallsZahlen, new AbstandVomMittelwertComperator());
		for(int i = 0; i< 100; i++) {
			System.out.print(zufallsZahlen[i] + " ");
			if ((i+1) % 10 == 0) System.out.println();
		}

	}

}
