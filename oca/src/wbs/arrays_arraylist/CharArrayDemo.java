package wbs.arrays_arraylist;

public class CharArrayDemo {
	/*
	 * Wir erzeugen ein zweidimensionales Char Array
	 * in dem jede Zeile einem Aufrufargument entspricht
	 * (nach Umwandlung in ein Char-Array)
	 */
	public static void main(String[] args) {
		int argslength = args.length;
		char[][] argumente = new char[argslength][];
		
		for(int i = 0; i< argslength; i++){
			argumente[i] = args[i].toCharArray();
		}
		for(char[] zeile: argumente) {
			for(char zeichen : zeile) {
				System.out.print(zeichen + " ");
			}
			System.out.println();
		}
	}
}
  