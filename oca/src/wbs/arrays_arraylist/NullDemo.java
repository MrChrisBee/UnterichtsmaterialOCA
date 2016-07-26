package wbs.arrays_arraylist;

import java.util.Arrays;

public class NullDemo {
	static String s;
	static StringBuffer sb;
	static Integer i;

	static String[] sa = new String[5]; // erzeugt eine Referenz auf ein Array mit lauter Null Einträgen

	public static void main(String[] args) {
		System.out.println(s);
		System.out.println(sb);
		// System.out.println(i.toString());
		System.out.println(sa);
		System.out.println(sa[0]);
		System.out.println(Arrays.toString(sa));
		//System.out.println(sa[0].toString());
	}

}
