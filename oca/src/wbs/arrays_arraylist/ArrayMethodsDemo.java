package wbs.arrays_arraylist;

public class ArrayMethodsDemo {

	public static void main(String[] args) {
		Integer[] integerArray = {122,17,2,56,99,-123};
		System.out.println(ArrayMethods.max(integerArray));
		String[] stringArray = {"anna","Bello","Toga","Zeta","Brummi"};
		System.out.println(ArrayMethods.max(stringArray));
		// Wir testen die Methode genericMax()
		System.out.println("++++++++++++++++++++++++++ The generic Part ++++++++++++++++++++++++");
		System.out.println(ArrayMethods.genericMax(integerArray));
		System.out.println(ArrayMethods.genericMax(stringArray));
		
		/*
		 * Wir deklarieren ein Array von Stringbuffer und bestücken es mit einigen Referenzen auf 
		 * StringBuffer Objekte
		 * dann versuchen wir, in diesem Array das maximale Element zu finden unter Verwendung der Methode 
		 * genericMax()
		 */
		
		StringBuffer[] sbArray = new StringBuffer[5];
		sbArray[0] = new StringBuffer("Das");
		sbArray[1] = new StringBuffer("wird");
		sbArray[2] = new StringBuffer("so");
		sbArray[3] = new StringBuffer("nichts");
		sbArray[4] = new StringBuffer("werden!");
		// System.out.println(ArrayMethods.genericMax(sbArray));
	} 

}
