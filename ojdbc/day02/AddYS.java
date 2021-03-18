package ojdbc.day02;

/*
 	hello 계정의 member 테이블에 박용수 회원을 추가하세요
 	이름: 박용수
 	아이디:  ys
 	비밀번호: 12345
 	메일 : ys@increpas.com
 	tel: 010-8888-8888
 	gen: 'M'
 	avt: 12
 */
import java.sql.*;
public class AddYS {
	Connection con;
	Statement stmt;
	
	public AddYS() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hello";
			String pw = "hello";
			
			con = DriverManager.getConnection(url, id, pw);
			
			StringBuffer buff = new StringBuffer();
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("		(SELECT NVL(MAX(mno)+1, 1001) FROM member), ");
			buff.append("		'박용수', 'ys', '12345', 'ys@increpas.com', '010-8888-8888', 'M', 12 ");
			buff.append(") ");
			
			String sql = buff.toString();
			
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			int cnt = stmt.executeUpdate(sql);
			
			if(cnt == 1) {
				System.out.println("성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				stmt.close();
			}catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new AddYS();
	}

}
