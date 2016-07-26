package wbs.arrays_arraylist;

public class MainArgsDemo {
/*
 * Wir geben alle Aufruf-Argumente aus
 * 1. for- Schleife
 * 2. for-each Schleife 
 */
	public static void main(String[] args) {
		for(int i =0; i < args.length; i++){
			System.out.println(args[i]);
		}
		for(String string:args) {
			System.out.println(string);
		}

	}

}
