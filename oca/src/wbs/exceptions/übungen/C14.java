package wbs.exceptions.übungen;

public class C14 {
	public static void main(String[] args) {
		try {
			System.out.println("abc".charAt(544));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("cba");
			System.exit(1);
		} finally {
			System.out.println("xyz");
		}
	}
}