package wbs.arrays_arraylist;

import java.util.Arrays;
import java.util.Comparator;

import wbs.operators_and_decisions.IntegerUtil;

class CmpByNumberOfPrimefactors implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		return Integer.compare(IntegerUtil.primFaktoren(i1).size(), IntegerUtil.primFaktoren(i2).size());
	}
}

class CmpByQuerSumme implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return Integer.compare(IntegerUtil.querSumme(i1), IntegerUtil
				.querSumme(i2));
	}

}

class CmpByNaturalOrdering implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	}
}

public class MehrStufenComparatorDemo_GZ {

	public static void main(String[] args) {
		
		MehrStufenComparator_GZ<Integer> cmp1 = new MehrStufenComparator_GZ<>();
		
		Integer[] ia = new Integer[1001];
		
		cmp1.getCmpList().add(new CmpByNumberOfPrimefactors());
		cmp1.getCmpList().add(new CmpByQuerSumme());
		cmp1.getCmpList().add(new CmpByNaturalOrdering());
		
		for(int i = 0;i < 1001;i++) {
			ia[i] = i + 2;
		}
		Arrays.sort(ia, cmp1);
		
		for(Integer i : ia) {
			System.out.println(i);
		}
	}
}
