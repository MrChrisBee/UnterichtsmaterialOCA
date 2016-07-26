package wbs.staticinit;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class MyJDBCDriver implements Driver {
	
	/*
	 * Wir schreiben nun einen Statischen Initialisierer, in dem die Treiberklasse sich 
	 * selbst initialisiert und die Referenz auf das erzeugte Treiberobjekt
	 * der statischen Methode registerDriver() von java.sql.DriveManager übergibt.
	 * Eventuelle Exceptions behandeln wir in geeigneter weise.
	 */
	
	static {
		try {
			DriverManager.registerDriver(new MyJDBCDriver());
		} catch (SQLException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

}
