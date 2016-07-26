package wbs.basic_data_types;

public class SimpleEqualsDemo {

	public static void main(String[] args) {

		String s1 = new String("anna");
		String s2 = new String("anna");
		/*
		 * aus der Api von String equals() : The result is true if and only if the argument is not
		 * null and is a String object that represents the same sequence of
		 * characters as this object. Sollte Bedeuten wir bekommen true als
		 * Ausgabe
		 */
		System.out.println(s1.equals(s2));
		// jep
		StringBuffer sb1 = new StringBuffer("anna");
		StringBuffer sb2 = new StringBuffer("anna");
		/*
		 * Nur String überschreibt equals(), StringBuilder und StringBuffer tun
		 * dies nicht. Ich nehme an für eine Gleichheit müsste es sich hier
		 * schon wirklich um das gleiche Objekt handelt, ham wa nich also: false
		 */
		System.out.println(sb1.equals(sb2));
 
	}

}
