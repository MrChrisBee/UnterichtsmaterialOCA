package wbs.exceptions;

import java.util.Arrays;

public class HasOnlyIntValuesDemo {

	/*
	 * Wir schreiben eine Methode, die Testet , ob alle Elemente eines String-Arrays 
	 * erfolgreich in einen int umgewandelt werden können
	 * 
	 * methodenname: hasOnlyIntValues()
	 * 
	 * test in der Methode Main
	 */
	
	public static void main(String[] args) {
		String[] test1 = {"1","45","678","45678"};
		String[] test2 = {"1","45","f678","45678"};
		String[][] test = {test1,test2};
		for(String[] schau: test) {
			System.out.println(Arrays.toString(schau) + (hasOnlyIntValues(schau)?" ist in ein gültiges IntArray umwandelbar! ":" hat Elemente die nicht in Int umzuwandeln sind!"));
		}
	}
	
	public static boolean hasOnlyIntValues(String[] zuTestenArray) {
		boolean result = true;
		for(String teste: zuTestenArray) {
			try {
				Integer.parseInt(teste);
			} catch (NumberFormatException e) {
				result = false;
				break;
			}
		}
		return result;
	} 
 
}
