package wbs.basic_data_types;

public class StringDemo {

	
	public static void main(String[] args) {
		String s = "hausmeister";
		// wir geben aus:
		// das 1. zeichen von s
		System.out.println(s.charAt(0));
		// das letzte zeichen von s
		System.out.println(s.charAt(s.length() - 1));
		// die länge von s
		System.out.println(s.length());
		// den index des ersten vorkommens des zeichens 's' in s
		System.out.println(s.indexOf('s'));
		// den index des letzten vorkommens des zeichens 's' in s
		System.out.println(s.lastIndexOf('s'));
		// alles ab dem 3. zeichen
		System.out.println(s.substring(2));
		// alles zwischen dem 3. und dem 7. zeichen
		System.out.println(s.substring(2,6));
		// den umgedrehten string 
		System.out.println(new StringBuffer(s).reverse());
		// den string in grossbuchstaben
		System.out.println(s.toUpperCase());

	}

}
