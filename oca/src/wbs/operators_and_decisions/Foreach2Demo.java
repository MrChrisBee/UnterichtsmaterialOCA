package wbs.operators_and_decisions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Foreach2Demo {
	/*
	 * Wir bestücken eine List mit 10 Zufallszahlen zwischen 1 und 20
	 * 
	 */
	public static void main(String[] args) {
		Random zufall = new Random();
		List<Integer> zufallsListe = new ArrayList<>();
		for (int n = 1; n <= 10; n++)
			zufallsListe.add(zufall.nextInt(20) + 1);
		for (int zahl : zufallsListe) {
			System.out.println(zahl);
		}
	}
}
