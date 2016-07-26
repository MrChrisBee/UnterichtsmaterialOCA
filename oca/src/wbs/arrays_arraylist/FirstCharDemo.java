package wbs.arrays_arraylist;

public class FirstCharDemo {
	/*
	 * Wir erzeugen ein CharArray 
	 * das von jedem Aufrufargument 
	 * das erste Zeichen enthält und geben es aus
	 */
	public static void main(String[] args) {
		char[] chars = new char[args.length];
		int j=0;
		for (int i=0;i<chars.length;i++) {
			chars[j] = args[j++].charAt(0); 
		}
		for (char thischar: chars) {
			System.out.println(thischar);
		}
		
	}

}
