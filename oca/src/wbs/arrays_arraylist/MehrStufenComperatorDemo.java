package wbs.arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class MehrStufenComperatorDemo {

	public static void main(String[] args) {
		List<Comparator<Integer>> cmpList = new ArrayList<>();
		Integer[] unOrdentlich = { 0, 3, 0, 8, 4 };
		System.out.println(Arrays.toString(unOrdentlich));
		cmpList.add(new BitCountPurComperator());
		cmpList.add(null);
		Comparator<Integer> myComp = new MehrStufenComperator<>(cmpList);
		Arrays.sort(unOrdentlich, myComp);
		System.out.println(Arrays.toString(unOrdentlich));
	}

} 
