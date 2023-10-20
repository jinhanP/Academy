package Controller;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String user = "javauser";
		String pwd = "javauser";
		Connection con = null;
		try {
			// 1.드라이버 로드(오라클을 불러오는데 컴퓨터가 여기서 실핼을 해서 알아먹기 때문에 try catch를 해줘야됨.)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("oracleDriver 적재성공");
//             2.오라클데이타베이스 연결
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("OracleDriver 접속성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클적재실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 접속실패");
		}
		return con;
	}

	
}