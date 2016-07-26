package wbs.exceptions;

import java.util.HashMap;
import java.util.Map;

class ParseDigitsHelper {

	private Map<String, Integer> map = new HashMap<>();

	public ParseDigitsHelper() {
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
	}

	public int parseDigits(String s) throws IllegalArgumentException {
		String[] digits = s.toLowerCase().split("_");
		IllegalArgumentException e = null;
		Integer ziffer;
		int zahl = 0;
		for (String digit : digits) {
			ziffer = map.get(digit);
			if (ziffer == null) {
				e = new IllegalArgumentException("not a valid string: " + s);
				break;
			}
			zahl = zahl * 10 + ziffer;
		}
		if (e != null) {
			throw e;
		}
		return zahl;
	}
}

public class ParseDigits2Demo {

	public static void main(String[] args) {

		String[] strings = { "one", "One_two", "_nine_nine_zero_", "nine__nine_zero", "nine_nine_zero_", "one_gaga",
				"zero_eight_one_five", "zero_zero_eight_one_five" };

		ParseDigitsHelper helper = new ParseDigitsHelper();

		for (String s : strings) {
			try {
				System.out.println(s + " -> " + helper.parseDigits(s));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
