package wbs.exceptions;

public class Unchecked2Demo {

	public static void main(String[] args) {
		System.out.println("vor try .. catch .. finally");
		try {
			System.out.println("in try vor kritischen code");
			int zahl = Integer.parseInt(args[0]);
			System.out.println("in try nach kritischen code");
			System.out.println(zahl);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("fehlermeldung:" + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("fehlermeldung:" + e.getMessage());
		} finally {
			System.out.println("In finally");
		}
		System.out.println("nach try .. catch .. finally");

		/*
		 * Fall 1: ohne Übergabeparameter 
		 * In jedem Fall wird
		 * "vor try .. catch .. finally" ausgegeben dann
		 * "in try vor kritischen code" da es sich um eine
		 * ArrayArrayIndexOutOfBoundsException 
		 * dann In finally und
		 * "nach try .. catch .. finally"
		 * 
		 */
		
		/*
		 * Fall2: mit ungültigem Übergabeparameter:
		 * In jedem Fall wird
		 * "vor try .. catch .. finally" ausgegeben dann
		 * "in try vor kritischen code"
		 * dieses mal ist es eine NumberFrormatException mit "For Input String: '????????'" für getMessage
		 * "In finally und"
		 * "nach try .. catch .. finally"
		 */
		/*
		 * Fall2: mit gültigem Übergabeparameter:
		 * In jedem Fall wird
		 * "vor try .. catch .. finally" ausgegeben dann
		 * "in try vor kritischen code"
		 * "in try nach kritischen code"
		 * die Zahl
		 * "In finally und"
		 * "nach try .. catch .. finally"
		 */
	}
}
