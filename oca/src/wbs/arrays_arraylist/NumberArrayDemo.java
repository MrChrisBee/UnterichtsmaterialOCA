package wbs.arrays_arraylist;

import java.math.BigInteger;

public class NumberArrayDemo {
		/*
		 * Wir bestücken ein Array mit der Zahl 1 als Instanz von
		 * Byte, Short, Integer,Long, Float, Double, BigInteger 
		 *  
		 * 
		 */
	public static void main(String[] args) {
		Number[] zahl1 = {(byte) 1, (short) 1, new Integer(1), 1l, 1.0f, new Double(1), BigInteger.ONE };
		
		for (int i = 0; i < zahl1.length; i++) {
			System.out.println(zahl1[i] + " -> " + zahl1[i].getClass());
		}
		
	}

}
