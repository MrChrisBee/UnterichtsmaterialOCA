package wbs.exceptions;

public class NumberUtilDemo {

	public static void main(String[] args) throws MyBruchException {
		double sTest = NumberUtil.string2Double("1/2/20");
		System.out.println(sTest);
	}
}
