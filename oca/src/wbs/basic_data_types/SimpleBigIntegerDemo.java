package wbs.basic_data_types;

import java.math.BigInteger;

public class SimpleBigIntegerDemo {
	/*
	 * wir multiplizieren den größtmöglichen Long-Wert mit
	 * sich selbst und geben das Exakte Ergebnis als BigInteger aus. 
	 * 
	 */
	public static void main(String[] args) {
		
		Long x = Long.MAX_VALUE;
		
		// eleganter ist BigInteger groessterLongWert = BigInteger.valueOf(Long.MAX_VALUE); 
		BigInteger groessterLongWert = new BigInteger(x.toString());
		BigInteger produkt = groessterLongWert.multiply(groessterLongWert);
		System.out.println(produkt);
		
	}
 
}
