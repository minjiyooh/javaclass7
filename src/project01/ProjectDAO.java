package project01;

import java.sql.SQLException;

public class ProjectDAO extends ProjectDBConn {
	ProjectVO vo = null;

	// 아이디 중복체크
	public boolean checkDuplicate(String id) {
		try {
			sql = "select * from hoewon where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			// ResultSet에서 데이터가 존재하면 중복된 아이디
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
			return false;
		} finally {
			rsClose();
		}
	}

//회원 가입처리
	public boolean setSingInsert(ProjectVO vo) {
		int res = 0;
		try {
			sql = "insert into hoewon values (default, ?, ?, ?, ?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getBirthday());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getPhonenumber());

			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res > 0;
		// res 값이 0이 아니면 true를 반환하고, 그렇지 않으면 false를 반환
	}

  //비밀번호2 확인
	public boolean setPassword(String password2) {
		try {
			sql = "select * from hoewon where password2 = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, password2);
			rs = pstmt.executeQuery();

			return rs.next(); // rs.next()의 반환값이 true이면 true를 반환하고, 그렇지 않으면 false를 반환

		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
			return false;
		} finally {
			rsClose();
		}
	}

	//로그인 확인
	public boolean login(String id, String password) {
		try {
			sql = "select * from hoewon where id = ? and password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			// ResultSet에서 데이터가 존재하면 로그인 성공
			return rs.next();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
			return false;
		} finally {
			rsClose();
		}
	}

}
