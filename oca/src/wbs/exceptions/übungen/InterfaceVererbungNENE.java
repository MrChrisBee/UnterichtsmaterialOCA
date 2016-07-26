package wbs.exceptions.übungen;

import java.io.FileNotFoundException;
import java.io.IOException;

interface I80 {
	void m() throws IOException;
}

interface I81 {
	void m() throws FileNotFoundException;
}

public class InterfaceVererbungNENE implements I80, I81 {
//	@Override
//	public void m() throws IOException {
	
	
	/*^- das geht nicht es verletzt I81
	 * da es Allgemeiner wird
	 * muss spezieller werden ???
	 */
	
	
	@Override
		public void m() throws FileNotFoundException {
			// TODO Auto-generated method stub
	}
}