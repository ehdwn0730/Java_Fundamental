package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDao1 {
	public int insert(MemberDto m) {
		int resultCount = 0;
		//1. 드라이브 로드한다.
		//Driver 객체를 메모리에 로드하여 java application과 mariadb-java-client-xxx.jar과 연결
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. 데이터 베이스와 연결
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",
					"kpc12",
					"kpc1234"
					);
			//3. SQL문을 전송할 수 있는 PreparedStatement객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr)");
			sql.append("VALUES(?, ?, ?)");
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수 설정과 쿼리문 전송
			int index = 0;
			pstmt.setInt(++index, m.getNum());
			pstmt.setString(++index, m.getName());
			pstmt.setString(++index, m.getAddr());
			
			//5. SQL문 전송
			resultCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6. 모든 자원을 반납
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}
	
	
	
	
	public int update(MemberDto m) {
		int resultCount = 0;
		//1. 드라이브를 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. 데이터 베이스와 연결
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",
					"kpc12",
					"kpc1234"
					);
			
			//3. SQL문을 전송할 수 있는 PreparedStatement객체 생성
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수 설정과 쿼리문 전송
			int index = 0;
			pstmt.setString(++index, m.getName());
			pstmt.setString(++index, m.getAddr());
			pstmt.setInt(++index, m.getNum());
			
			//5. SQL문 전송
			resultCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6. 모든 자원 반납
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultCount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
