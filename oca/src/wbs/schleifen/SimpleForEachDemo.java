package wbs.schleifen;

public class SimpleForEachDemo {
	/*
	 * wir geben alle ungeraden Zahlen zwischen 1 und 20 aus.
	 */
	public static void main(String[] args) {
		int[] myInts = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		for(int zahl:myInts) {
			if ((zahl % 2)>0)
				System.out.println(zahl);
		}
	}

}
