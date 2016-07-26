package wbs.basic_data_types;

public class IntegerDemo {

	public static void main(String[] args) {
		int n1 = 100;
		String s1 = "100100100";
		int n2 = 123456789;
		int n3 = 123454300;
		int zahl;

		// wir geben die zahl 100 als dualzahl aus
		System.out.println(Integer.toBinaryString(n1)); // 1100100
		// wir geben die zahl 100 als oktalzahl aus
		System.out.println(Integer.toOctalString(n1));  // 144
		// wir geben die zahl 100 als hexadezimalzahl aus
		System.out.println(Integer.toHexString(n1));	// 64
		// wir geben die zahl 100 im stellenwertsystem mit der basis 12 aus
		System.out.println(Integer.toString(n1, 12));	// 84

		// wir parsen den string "100100100" als dualzahl
		zahl = Integer.parseInt(s1, 2);
		System.out.println(zahl);  // 292
		// wir parsen den string "100100100" als oktalzahl
		zahl = Integer.parseInt(s1, 8);
		System.out.println(zahl);  // 16810048
		// wir parsen den string "100100100" als dezimalzahl
		zahl = Integer.parseInt(s1);
		System.out.println(zahl);  // 100100100
		try {
			// wir parsen den string "100100100" als hexadezimalzahl
			zahl = Integer.parseInt(s1, 16);
			System.out.println(zahl);
		} catch (NumberFormatException e) {
			System.out.println("...ups...");  // ...ups...
		}
		// wir parsen den string "100100100" als zahl im stellenwertsystem mit
		// der basis 12
		zahl = Integer.parseInt(s1, 12);
		System.out.println(zahl);  // 430230672

		// wir geben die anzahl der einserbits in der zahl 123456789 aus
		System.out.println(Integer.bitCount(n2));  // 16
		// wir geben den stellenwert des höchstwertigen einserbits von 123456789
		// aus
		System.out.println(Integer.highestOneBit(n2));  // 67108864 (2 ^ 26)
		// wir geben den stellenwert des niedrigstwertigen einserbits von
		// 123454300 aus
		System.out.println(Integer.lowestOneBit(n3));  // 4 (2 ^ 2)

	}

}
