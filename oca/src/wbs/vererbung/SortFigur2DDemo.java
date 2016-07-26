package wbs.vererbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortFigur2DDemo {

	public static void main(String[] args) {
		Figur2D kreis1 = new Kreis(1.1);
		Figur2D kreis3 = new Kreis(5.5);
		Figur2D kreis4 = new Kreis(13.0);
		Figur2D kreis5 = new Kreis(160);
		Figur2D kreis2 = new Kreis(4.0);
		Figur2D kreis6 = new Kreis(5.0);
		Figur2D rechteck1 = new Rechteck(1, 3);
		Figur2D rechteck2 = new Rechteck(2, 2);
		Figur2D rechteck3 = new Rechteck(3, 1);
		Figur2D rechteck4 = new Rechteck(4, 4);
		Figur2D rechteck5 = new Rechteck(5, 5);
		Figur2D rechteck6 = new Rechteck(6, 6);
		Figur2D rechteck7 = new Rechteck(7, 7);
		
		List<Figur2D> list = new ArrayList<>();
		list.add(kreis1);
		list.add(kreis2);
		list.add(kreis3);
		list.add(kreis4);
		list.add(kreis5);
		list.add(kreis6);
		list.add(rechteck1);
		list.add(rechteck2);
		list.add(rechteck3);
		list.add(rechteck4);
		list.add(rechteck5);
		list.add(rechteck6);
		list.add(rechteck7);
		for(Figur2D element :  list) {
			System.out.println(element.Flaeche());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Collections.sort(list);
		for(Figur2D element :  list) {
			System.out.println(element);
		}
		
		/*
		 * Welcher strukturelle Zusammenhang besteht zwischen der Methode sort()
		 * der Klasse Collections und der Methode flaecheUnterGraph der Klasse FunktionUtil
		 * 
		 * Beide Methoden wissen nur wenig (die Interfacedeklararation) über die Objekte mit denen Sie zusammen arbeiten. 
		 * Sie kennnen nicht den Object-type sondern nur den reference-type dieser Objekte.
		 * Der Referenztyp ist in beiden Fällen ein Interface  (sort() / Comperable<>, flaecheUnterGraph() / IFunction)
		 * 
		 */
	}

}
