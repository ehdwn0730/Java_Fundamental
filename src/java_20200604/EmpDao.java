package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {
	//1. Singleton pattern 코딩
	//	1) 생성자의 접근한정자를 private으로 설정한다.
	//	2) 해당 클래스의 객체를 생성할 수 있는 변수를 static으로 선언한다.
	//	3) 해당 클래스의 객체를 생성할 수 있는 메서드를 static으로 만든다.
	//  4)
	private static EmpDao dao;
	
	public static EmpDao getInstance() {
		if(dao == null) {
			dao = new EmpDao();
		}
		return dao;
	}
	
	private EmpDao() {
		try {
		Class.forName("org.mariadb.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	
	public int insert(EmpDto e) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1234"
					);
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp (empno, ename, job, mgr, ");
			sql.append("hiredate, sal, comm, deptno) VALUES ");
			sql.append("(?, ?, ?, ?, CURDATE(), ?, ?, ?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, e.getNo());
			pstmt.setString(++index, e.getName());
			pstmt.setString(++index, e.getJob());
			pstmt.setInt(++index, e.getMgr());
			pstmt.setInt(++index, e.getSal());
			pstmt.setInt(++index, e.getComm());
			pstmt.setInt(++index, e.getDeptNo());
			
			resultCount = pstmt.executeUpdate();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			close(con, pstmt, null); // 굳이 2개짜리를 만들 필요가없다. 최대한 중첩되는 것은 축소하는게 좋다
		}
		return resultCount;
	}

	
	
	public int update(EmpDto e) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1234"
					);
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp ");
			sql.append("SET ename = ? , job = ?, mgr = ?, hiredate = CURDATE(), ");
			sql.append("sal = ?, comm = ?, deptno = ? ");
			sql.append("WHERE empno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setString(++index, e.getName());
			pstmt.setString(++index, e.getJob());
			pstmt.setInt(++index, e.getMgr());
			pstmt.setInt(++index, e.getSal());
			pstmt.setInt(++index, e.getComm());
			pstmt.setInt(++index, e.getDeptNo());
			pstmt.setInt(++index, e.getNo());
			
			resultCount = pstmt.executeUpdate();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			close(con, pstmt, null);
		}
		return resultCount;
	}

	
	
	
	public int delete(int no) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1234"
					);
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM emp WHERE empno = ? ");
		
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, no);
		
			resultCount = pstmt.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return resultCount;
	}

	// 블록처리 ==> 오른쪽 마우스 버튼 ==> refactor ==> extract method
	/*private void close(Connection con, PreparedStatement pstmt) {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
*/
	
	public ArrayList<EmpDto> select(int start, int len){
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1234"
					);
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate,'%Y.%m.%d'), sal, comm, deptno ");
			sql.append("FROM emp ORDER BY empno DESC ");
			sql.append("LIMIT ?, ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			
			pstmt.setInt(++index, start);
			pstmt.setInt(++index, len);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 0;
				int no = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptNo = rs.getInt(++index);
				list.add(new EmpDto(no, name, job, mgr, hireDate, sal, comm, deptNo));
				}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public EmpDto select(int no) {
		EmpDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("");
			sql.append("");
			sql.append("");
			sql.append("");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;

			pstmt.setInt(++index, 0);
			pstmt.setString(++index, "");

			rs = pstmt.executeQuery();
			if (rs.next()) {
				index = 0;
				int x1 = rs.getInt(++index);
				String x2 = rs.getString(++index);

				dto = new EmpDto();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}


	
	
	
	
	
	
	
	
	
	
	
}
