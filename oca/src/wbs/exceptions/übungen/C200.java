package wbs.exceptions.übungen;

public class C200 {
	public static void main(String[] args) {
		try {
			throw new Throwable(new Throwable("blabla"));
		} catch (Throwable t) {
			System.out.println(t.getCause().getMessage());
		}
	}
}