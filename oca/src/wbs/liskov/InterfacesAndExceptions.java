package wbs.liskov;

import java.io.IOException;
import java.sql.SQLException;


interface I1 {
	public void m() throws IOException ;
}

interface I2 {
	public void m() throws SQLException;
}

class C1 implements I1, I2 {

	//	public void m() throws IOException {}; So nicht IO != SQL

	//	public void m() throws SQLException {}; auch so ist es mist
	
	//  public void m() throws Exception {}; beide Verletzt
	
	@Override
	public void m() {
		throw new ArrayIndexOutOfBoundsException();
	}
	
}