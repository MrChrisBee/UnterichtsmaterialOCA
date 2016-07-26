package wbs.operators_and_decisions;

public class BitOperatorenDemo {

	public static void main(String[] args) {
		int n1 = 10;
		// 8421
		// 1010
		int n2 = 3;
		// 8421
		// 0011

		/* n1 | n2 
		 * 1010
		 * 0011
		 * ----
		 * 1011
		 * = 11
		 *
		 * n1 & n2
		 * 1010
		 * 0011
		 * ----
		 * 0010
		 * = 2
		 * 
		 * n1 ^ n2
		 * 1010
		 * 0011
		 * ----
		 * 1001
		 * = 9
		 * 
		 * 
		 */

		System.out.println(n1 | n2);
		System.out.println(n1 & n2);
		System.out.println(n1 ^ n2);
		
		System.out.println(n1 << 3); //1010 um 3 stellen nach links 1010000 = 80
		// n1 << 3 entspricht 10 * 2 ^3 = 10 * 2 * 2 * 2 = 10 * 8 = 80
		// eine Verschiebung um n stellen nach links entspricht einer multiplikation mit 2^n
		System.out.println(n2 << 5); // 11 << 5 = 1100000 = 32 + 64 = 96
		// n2 << 5 entspricht 3 * 2 ^ 5 = 3 * 2 * 2 * 2  * 2 * 2 = 3 * 32 = 96
		System.out.println(n1 >> 1); // 1010 >> 1 = 101 = 5
		// 1010 >> 1 enspricht 10 / 2 ^ 1 = 10 / 2 = 5
		// eine Verschiebung um n stellen nach rechts entspricht einer division mit 2^n 
		
		System.out.println(Integer.toBinaryString(~0));
		System.out.println(Integer.toBinaryString((~0) >> 1));
		System.out.println(Integer.toBinaryString((~0) >>> 1));
		
		n1 = 1;
		while(n1 <= 31) {
			System.out.println(1 << n1);
			n1++;
		}
		//es sollten die dezimalen werte von 2^1 bis 2^31 
		//also 2 bis 2147483648 erscheinen
		// das ist eins größer als Integer.MAX_VALUE also negativ
		System.out.println(Integer.MAX_VALUE);
	}

}
