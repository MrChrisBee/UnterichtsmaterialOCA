package wbs.test;

import java.util.BitSet;

public class BitSetTest {

	public static void main(String[] args) {
		BitSet myFirstBitSet = new BitSet();
		String s1 = "atesten";
		for(int i=0; i< s1.length(); i++ ) {
			myFirstBitSet.set(s1.charAt(i)-'a'); 
		}
		System.out.println(myFirstBitSet.toString());
		System.out.println("Der String " + s1 + " hat " + myFirstBitSet.cardinality() + " verschiedene Buchstaben.");
	}

}
