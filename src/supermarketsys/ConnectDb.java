package supermarketsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDb {
	//int i;
	//public String name, password;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/marketsys";
	private static String sqlName = "root";
	private static String sqlPass = "sdusunying";

	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;

	public ConnectDb() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, sqlName, sqlPass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new RuntimeException("Î´ÖªµÄÒì³£");
		}
	}

	public int getScore(String vipnumber, String password) {
	
		int score = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from vipname");
			while (rs.next()) {
				if (vipnumber.equals(rs.getString(5))
						&& password.equals(rs.getString(3))) {
				score =rs.getInt(4);
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return score;
	}
	
	public boolean testLogin(String workernumber, String password) {
		
		boolean b = false;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from workerinfo");
			while (rs.next() && b == false) {
				if (workernumber.equals(rs.getString(1))
						&& password.equals(rs.getString(2))) {
					b = true;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}
	
	public String getMoney(String code){
		String Money=null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from goodsinfo");
			while(rs.next()){
				if (code.equals(rs.getString(1))){
					//Money_Name[0]=rs.getString(2);
					Money=rs.getString(7);
				}			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Money;
	}
//	
	public String getName(String code){
		String Name=null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from goodsinfo");
			while(rs.next()){
				if (code.equals(rs.getString(1))){
					Name=rs.getString(2);
					//Money=rs.getString(7);
				}			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Name;
	}
	
	
	
	
	
	
	
	/*public String drsome(int i)  {
		
		String word=null;
		String sql="select * from drawing where numb= " + "'" + i + "'";;
		try{
			
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next())
		
			word = rs.getString(2);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return word;
		
		
	}*/

	public void close() {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

