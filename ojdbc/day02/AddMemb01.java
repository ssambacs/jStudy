package ojdbc.day02;

/*
 	member 테이블에 회원 한명을 추가
 	
 */
import java.sql.*;
public class AddMemb01 {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public AddMemb01() {
		try {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 커넥션 얻어오고
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hello";
		String pw = "hello";
		con = DriverManager.getConnection(url, id, pw);
		// 이 작업이 완료되면 세션을 하나 얻어온 상태가 되다.
		
		// 질의명령 준비
		StringBuffer buff = new StringBuffer();
		buff.append("INSERT INTO ");
		buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
		buff.append("VALUES( ");
		buff.append("		(SELECT NVL(MAX(mno)+1, 1001) FROM member), ");
		buff.append("		'전은석', 'euns', '12345', 'euns@increpas.com', '010-3175-9042', 'M', 11 ");
		buff.append(") ");
		
		String sql = buff.toString();
		// Statement 를 꺼내오고
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		// 질의명령 보내고
//		boolean bool = stmt.execute(sql);
		// execute() 함수는 반환값이 boolean 타입인데 의미는
		// 질의명령의 실행여부를 알려주는 것이 아니고
		// JDBC에서 DBMS에게 질의명령이 전달되었는지 여부를 알려준다.
		
		int cnt = stmt.executeUpdate(sql);
		// executeUpdate() 는 정수를 반환해주느데
		// 반환값의 의미는 변경된 행 수를 반환해준다.
		// update 명령의 경우 실행결과 변경된 행 수를 반환해주고
		// insert 질의명령의 경우 추가된 행 수( 1 )를 반환해준다.
		
		// 결과 받아서 처리
		if(cnt == 1) {
			System.out.println("전은석 회원의 가입이 정상적으로 처리되었습니다.");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 이 블럭에서는 사용했던 자원을 모두 반환해줘야 한다.
			// 순서는 만든 순서의 역순
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {}
		
		}
	}

	public static void main(String[] args) {
		new AddMemb01();
	}

}
