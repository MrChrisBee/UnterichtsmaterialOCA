package wbs.vererbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Figur2DDemo {

	public static void main(String[] args) {
		/*
		 * kreis1 ist eine lokale variable der Methode main der Konstruktor von
		 * Kreis ruft automatisch den Konstruktor von Figur2D aus der
		 * Konstruktor von Figur2D erhöht den wert des statischen Feldes um 1
		 * die Klasse Figur3D überschreibt die Methoden Fläche und Umfang Wir
		 * legen ein Objekt der Klasse Figur2D (reference-type) an der Objekt
		 * Typ dieses Objekts ist Kreis
		 */
		Figur2D kreis1 = new Kreis(1.0);
		// durch System.out.println(kreis1); nutzen wir die von Figur2D
		// überschriebene
		// Methode toString()
		// beim Aufruf einer nicht statischen Methode wird die Spezeziellste
		// Methode in der Klassenhirachie
		// des Objekt-Types gewählt
		System.out.println(kreis1);
		Figur2D rechteck = new Rechteck(2, 3);
		System.out.println(rechteck);
		System.out.println(rechteck.compareTo(kreis1));
		Figur2D dreieck = new Dreieck(10, 5, 7);
		System.out.println(dreieck);
		/*
		 * Wir erzeugen eine List und legen in dieser List die Referenz auf die
		 * 3 Figur2D-Objekte ab dann geben wir die List element für Element aus
		 */
		List<Figur2D> list = new ArrayList<>();
		list.add(rechteck);
		list.add(dreieck);
		list.add(kreis1);
		for (Figur2D element : list) {
			System.out.println(element.Flaeche());
		}
		Collections.sort(list);
		for (Figur2D element : list) {
			System.out.println(element.Flaeche());
		}

	}

}
