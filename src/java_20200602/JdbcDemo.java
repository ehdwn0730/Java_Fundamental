package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) {

		// 1. 드라이브 로드한다.
		// Driver 객체를 메모리에 로드하여 Java Application과
		// mariadb-java-client-xxx.jar과 연결한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("드라이버 로드 실패");
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 2. 데이터 베이스와 연결
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",
					"kpc12",
					"kpc1234");

			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES(?, ?, ?)");
			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수 설정과 쿼리문 전송
			pstmt.setInt(1, 10);
			pstmt.setString(2, "맘모스");
			pstmt.setString(3, "고대");

			// 5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. 모든 자원을 반납
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
