package wbs.basic_data_types;

public class C05 {
	public static void main(String[] args) {
		Number n1 = 1;
		Number n2 = 1L;
		Number n3 = (byte) 1;
		Number n4 = (short) 1;
		Number n5 = 0b11;
		Number n6 = 0b11L;
		Number n7 = 1.0;
		Number n8 = 1.0f;
		System.out.println(n1.getClass());
		System.out.println(n2.getClass());
		System.out.println(n3.getClass());
		System.out.println(n4.getClass());
		System.out.println(n5.getClass());
		System.out.println(n6.getClass());
		System.out.println(n7.getClass());
		System.out.println(n8.getClass());
	}
}

