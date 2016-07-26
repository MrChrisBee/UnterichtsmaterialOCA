package wbs.exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
	
		// Wie alt kann man sein? negativ auf jeden Fall nicht.
		
		int alter = 99;
		
		
		 if(alter < 0 )
			 throw new IllegalArgumentException("Du bist bestimmt nitcht " + alter + " Jahre alt.");
	}

}
