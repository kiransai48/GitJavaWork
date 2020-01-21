import java.sql.*;

public class PreparedStatementSelectExample {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			String url = "jdbc:mysql://localhost:3306/";
			String db = "jdbcexamples";
			String driver = "com.mysql.jdbc.Driver";

			Class.forName(driver);
			con = DriverManager.getConnection(url + db, "root", "root");

			String sql = "select * from employee where id>?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, 1);

			rs = pst.executeQuery();
			System.out.println("EmployeeID\tFirstName");
			while (rs.next()) {
				System.out.print("  " + rs.getString(1));
				System.out.print("\t\t" + rs.getString(2));
				System.out.println("\t\t" + rs.getString(3));
			}
			rs.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
