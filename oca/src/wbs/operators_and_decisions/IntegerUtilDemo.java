package wbs.operators_and_decisions;

import java.util.ArrayList;
import java.util.List;


public class IntegerUtilDemo {

	public static void main(String[] args) {
		int n = -1;
		// n = (int) Math.pow(2, 30) + 16;
		System.out.println("Der Wert von n :" + n);
		System.out.println("toBinaryString : " + Integer.toBinaryString(n));
		int myCounter;

		myCounter = IntegerUtil.countBits(n);
		System.out.println("myValue bitCounter " + myCounter);

		myCounter = IntegerUtil.highestOneBit(n);
		System.out.println("myCounter in dualer Schreibweise : "
				+ Integer.toBinaryString(myCounter));
		System.out.println("myValue highestOneBit :" + myCounter);
		System.out
				.println("Integer.highestOneBit :" + Integer.highestOneBit(n));

		myCounter = IntegerUtil.lowestOneBit(n);
		System.out.println("my Value lowest One Bit " + myCounter);
		System.out.println("********************************************");
		myCounter = IntegerUtil.indexOfHighestOneBit(n);
		System.out.println(myCounter);
		System.out.println("********************************************");
		myCounter = IntegerUtil.indexOfLowestOneBit(n);
		System.out.println(myCounter);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the Quersumme");
		System.out.println(IntegerUtil.querSumme(2356));
		System.out.println(IntegerUtil.querSummeGZ(2356));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the CollatzZahl");
		for (int m = 1; m <= 100; m++) {
			int cz = IntegerUtil.colatzZahl(m);
			for (int j = 1; j < cz; j++) {
				System.out.print("*");
			}
			System.out.println(m + " : " + cz);
		}
		List<Integer> colList = new ArrayList<>();
		colList = IntegerUtil.collatzZahl2(18);
		System.out.println(colList + "  \u01A9 " + colList.size());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the reverse");
		System.out.println(IntegerUtil.reverse(-54321));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the reverse2");
		System.out.println(IntegerUtil.reverse2(54321));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the reverse3");
		System.out.println(IntegerUtil.reverse3(654321));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the countDifferentDigits");
		System.out.println(IntegerUtil.countDifferentDigits(4711));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the countDifferentDigitsGZ");
		System.out.println(IntegerUtil.countDifferentDigitsGZ(0));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the echteTeiler");
		System.out.println(IntegerUtil.echteTeiler(2048));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the istVollkomen");
		int vorkommen = 0;
		for (int i = 1; i <= 10000; i++) {
			if (IntegerUtil.istVollkommen(i)) {
				System.out.println(i);
				vorkommen++;
			}
		}
		System.out.println("Es gibt " + vorkommen
				+ " Vollkommene Zahlen zwischen 1 und 10000");
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the primFaktoren(int zahl)");
		
		System.out.println(IntegerUtil.primFaktoren(Integer.MAX_VALUE -1));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("here comes the primFaktoren2(int zahl)");
		
		System.out.println(IntegerUtil.primFaktoren2(10));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("gib mal ein paar Primzahlen");
		for (int testemal = 2; testemal <= 30; testemal++) {
			if (IntegerUtil.primFaktoren(testemal).size() == 1) {
				System.out.println(testemal);
			}
				
		}
		

	}
}
