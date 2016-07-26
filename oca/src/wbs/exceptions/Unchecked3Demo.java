package wbs.exceptions;

public class Unchecked3Demo {

	public static void main(String[] args) {
		System.out.println("vor try .. catch .. finally");
		try {
			System.out.println("in try vor kritischen code");
			int zahl = Integer.parseInt(args[0]);
			System.out.println("in try nach kritischen code");
			System.out.println(zahl);
		}catch (RuntimeException e) {
			System.out.println(e);
			System.out.println("fehlermeldung:" + e.getMessage());
		} finally {
			System.out.println("In finally");
		}
		System.out.println("nach try .. catch .. finally");
		
		/*
		 * Fall 1: ohne Übergabeparameter 
		 * "vor try .. catch .. finally" ausgegeben dann
		 * "in try vor kritischen code" 
		 * ArrayArrayIndexOutOfBoundsException 0
		 * fehlermeldung: 0 
		 * "In finally"
		 * "nach try .. catch .. finally"
		 * 
		 */

		/*
		 * Fall2: mit ungültigem Übergabeparameter:
		 * "vor try .. catch .. finally" ausgegeben dann
		 * "in try vor kritischen code"
		 * NumberFormatException "For Input String: '????????'"
		 * fehlermeldung: "For Input String: '????????'" 
		 * "In finally und"
		 * "nach try .. catch .. finally"
		 */
		
		/*
		 * Fall3: mit gültigem Übergabeparameter:
		 * "vor try .. catch .. finally" ausgegeben dann
		 * "in try vor kritischen code"
		 * "in try nach kritischen code"
		 * die Zahl
		 * "In finally und"
		 * "nach try .. catch .. finally"
		 */
		/*
		 * Der Unterschied zu Unchecked2Demo besteht darin das beide Exceptions in einem Catch Block abgefangen werden 
		 * Sowohl NumberFormat als auch ArrayIndexOutOfBounce sind Subklassen von RuntimeException
		 */
	}
}
