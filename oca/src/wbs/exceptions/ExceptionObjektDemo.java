package wbs.exceptions;

public class ExceptionObjektDemo {

	public static void main(String[] args) {
		String input = "ssssssssssss";

		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out
					.println("Ihre Eingabe konnte nicht in eine Zahl umgewandellt werden.\n");
			System.out.println("Es wwurde folgende Ausnahme ausgelöst : \n" + e.getClass().getName());
			System.out.println(e.getMessage());
		}
	}

}
