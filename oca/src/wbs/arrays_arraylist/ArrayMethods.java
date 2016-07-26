package wbs.arrays_arraylist;

public class ArrayMethods {

	/*
	 * Wir schreiben eine Methode, die in einem Array von Integer (nicht int)
	 * das größte Element findet

	 * Wir schreiben eine Methode, die in einem Array von String 
	 * das größte Element findet
	 * 
	 * wir geben beiden Methoden den Namen max()
	 * 
	 */

	public static Integer max(Integer[] intArr) {
		Integer derGrößteWert = Integer.MIN_VALUE;
		for(Integer i: intArr){
			if (i > derGrößteWert)
				derGrößteWert = i;
		}
		return derGrößteWert;
	}

	
	public static String max(String[] strArr) {
		StringBuffer derGrößteString = new StringBuffer();
		for(String s: strArr){			
			if (s.compareTo(derGrößteString.toString()) > 0) {
				derGrößteString = new StringBuffer(s);				
			}
		}
		return derGrößteString.toString();
	}
	
	/*
	 * wir schreiben jetzt eine generische Variante der Methode max() 
	 * und nennen sie genericMax.
	 * Wir ersetzen dazu den konkreten Typ durch einen Platzhalter, auch Typ-Parameter genannt
	 * Wir nennen diesen Typ-Parameter T
	 * für T lassen wir jeden beliebigen Typ zu, der ein natural Ordering hat,
	 * also das Interface Comparable<> implementiert
	 * vor den return Typ wird in der Methode der Typ-Parameter deklariert
	 * (in der sogenannten TypParameterSektion): <T extends Comparable<? super T>>
	 * hier wird vom Typ T verlangt, das er das Interface Compareable<> 
	 * implementiert, und zwar für den Typ T oder einen Basistyp von T    

	 */
	
	public static <T extends Comparable<? super T>> T genericMax(T[] ta) {
		T max = ta[0];
		for(int i=1; i < ta.length; i++){
			if (ta[i].compareTo(max) > 0) {
				max = ta[i];
			}
		}
		return max;
	}
	
	
}
