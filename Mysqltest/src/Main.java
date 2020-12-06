
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) {
				
		//드라이버 로드 & 커넥션 생성
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database?useSSL=false&user=root&password=wjswns!#1059");
			System.out.println("DB connection OK!");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("DB Driver Error !");

		} catch(SQLException se) {
			se.printStackTrace();
			System.out.println("DB Connection Error !");

		}
		
	}
}
