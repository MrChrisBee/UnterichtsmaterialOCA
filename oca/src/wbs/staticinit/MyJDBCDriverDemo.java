package wbs.staticinit;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class MyJDBCDriverDemo {

	public static void main(String[] args) throws Exception {
		//Hinweis: ab JDBC 4 ist das laden der Treiberklassen nicht mehr nötig

		Class.forName("wbs.staticinit.MyJDBCDriver");
		Enumeration<Driver> drivers = DriverManager.getDrivers();

		while (drivers.hasMoreElements()) {
			System.out.println(drivers.nextElement().getClass().getName());
		}

		/*  Connection conn =
		*   DriverManager.getConnection("");
		*   
		*/

	}

}
