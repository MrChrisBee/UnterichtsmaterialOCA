package wbs.exceptions.übungen;

import java.sql.SQLException;

public class C12 {
	public static void main(String[] args) throws SQLException {
		throw Math.random() > 0.5 ? new IllegalArgumentException("abc") : new StringIndexOutOfBoundsException("def");
	}
}