package wbs.arrays_arraylist;

import java.util.Arrays;
import java.util.List;

public class AsListDemo {

	public static void main(String[] args) {
		/*
		 * Wir erzeugen eine List von Integer unter Verwendung von
		 * Arrays.alList() und übergeben dabei mehrere Integer Referenzen als Objekt.
		 */

		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5);

		/*
		 * Wir erzeugen eine List von String unter Verwendung von
		 * Arrays.alList() und übergeben dabei einen Verweis 
		 * auf ein String-Array
		 * 
		 */
		List<String> sList = Arrays.asList(new String[] { "TOOLBAR_TO_DO_LIST", "TOOLBAR_PROPERTY", "TOOLBAR_PEOPLE",
				"TOOLBAR_INSURANCE", "TOOLBAR_BATCH", "TOOLBAR_INFORMATION_REFERENCE", "TOOLBAR_LR_PROPERTY",
				"TOOLBAR_CASE_FOLDER", "TOOLBAR_INSPECTION_RESULT", "TOOLBAR_MY_OFFICE" });
		/* 
		 * Wir ermitteln den Objekttype der gelieferten Lists.
		 */

		System.out.print("Das Objekt iList hat den Objekttyp :" + iList.getClass().getName());
		System.out.println(" und seine Elemente sind vom Typ " + iList.get(0).getClass().getName());
		System.out.print("Das Objekt sList hat den Objekttyp :" + sList.getClass().getName());
		System.out.println(" und seine Elemente sind vom Typ " + sList.get(0).getClass().getName());
		
		/* zur Ausgabe :java.util.Arrays$ArrayList
		 * Der Objekttyp der gelieferten Lists ist eine statische innere Klasse
		 * von java.util.Arrays namens ArrayList 
		 * diese innere Klasse ist Subklasse von AbstractList
		 * In AbstractList werfen Methoden die die list verändern wollen 
		 * eine Exception
		 */

		/*
		 * Wir rufen Operationen auf die die Lists verändern würden 
		 * und fangen die dabei geworfenen Exceptions 
		 */

		try {
			iList.add(1);
		} catch (UnsupportedOperationException e) {
			System.err.println("Dieser List können sie nichts hinzufügen!");
		}

		try {
			iList.remove(2);
		} catch (UnsupportedOperationException e) {
			System.err.println("Aus dieser List können sie nichts entfernen!");
		}
	}

}
