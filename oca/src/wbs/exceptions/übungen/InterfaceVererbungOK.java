package wbs.exceptions.übungen;

import java.io.FileNotFoundException;
import java.io.IOException;

interface I90 {
	void m() throws IOException;
}

interface I91 {
	void m() throws FileNotFoundException;
}

public class InterfaceVererbungOK implements I90, I91 {
	@Override
	public void m() throws FileNotFoundException {
		// TODO Auto-generated method stub
	}
}