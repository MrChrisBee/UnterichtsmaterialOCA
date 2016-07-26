package wbs.operators_and_decisions;

public class ToBinaryStringDemo {

	public static String toBinaryString(int zahl) {
		StringBuffer sb = new StringBuffer(32);
		for (int n = (1 << 31); n != 0; n >>>= 1) {
			sb.append((zahl & n) != 0 ? 1 : 0);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 29;
		int n3 = -1;
		System.out.println(toBinaryString(n1));
		System.out.println(toBinaryString(n2));
		System.out.println(toBinaryString(n1 & n2) + " & ");
		System.out.println();
		System.out.println(toBinaryString(n1));
		System.out.println(toBinaryString(n2));
		System.out.println(toBinaryString(n1 | n2) + " | ");
		System.out.println();
		System.out.println(toBinaryString(n1));
		System.out.println(toBinaryString(n2));
		System.out.println(toBinaryString(n1 ^ n2) + " ^ ");
		System.out.println();
		System.out.println(toBinaryString(n1 << 3) + " << ");
		System.out.println();
		System.out.println(toBinaryString(n3-16) );
		System.out.println(toBinaryString(n3 >>> 3) + " >> ");
		System.out.println();
		System.out.println(toBinaryString(n3 >>> 1) + " >>> ");
		System.out.println(n3-16);
		System.out.println(n3 >>> 2);
	}
}