package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectDBConn {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String sql = " ";

	public ProjectDBConn() {
		String url = "jdbc:mysql://localhost:3306/javaclass7";
		String user = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				System.out.println("데이터 베이스 연동 실패~~ " + e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패~~ " + e.getMessage());
		}
	}

	// connClose()
	public void connClose() {
		try {
			conn.close();
		} catch (SQLException e) {
		}
	}

	// pstmtClose()
	public void pstmtClose() {
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (Exception e) {
		}
	}

	// rsClose()
	public void rsClose() {
		try {
			if (rs != null)
				rs.close();
			pstmtClose();
		} catch (Exception e) {
		}
	}
}
