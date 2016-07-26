package wbs.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

;

class Exc1 {
	void m() throws FileNotFoundException {
	}
}

class Exc1Sub1 extends Exc1 {
	// es können weniger Exceptions deklariert werden
	void m() {
	}
}

class Exc1Sub2 extends Exc1 {
	// es können zusätzliche unchecked Exceptions deklariert werden
	void m() throws IllegalArgumentException {
	}
}

class Exc1Sub3 extends Exc1 {
	// es können keine checked Exceptions deklariert werden die nicht Subklassen
	// der Deklarierten Exceptions in der Basisklasse sind
	// void m() throws SQLException{}
}

class Exc2 {
	void m() throws IOException {
	}
}

class Exc2Sub1 extends Exc2 {
	// es können checked Exceptions deklariert werden die Subklassen von der in
	// der Basisklasse deklarierten Exception sind
	void m() throws FileNotFoundException {
	}
}

public class ExceptionAndOverride {

}
