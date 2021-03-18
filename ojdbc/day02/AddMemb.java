package ojdbc.day02;

import java.sql.*;
public class AddMemb {
	Connection con;
	PreparedStatement pstmt;
	public AddMemb() {
		MemberVO ys = new MemberVO();
		//김기은 회원 데이터 추가
		ys.setName("김기은");
		ys.setId("kieun");
		ys.setPw("12345");
		ys.setMail("kieun@increpas.com");
		ys.setTel("010-5555-5555");
		ys.setGen("M");
		ys.setAno(13);
		
		// 데이터베이스 작업
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 얻어오고
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hello";
			String pw = "hello";
			
			con = DriverManager.getConnection(url, id, pw);
			
			// 질의명령 작성
			
			StringBuffer buff = new StringBuffer();
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("		(SELECT NVL(MAX(mno)+1, 1001) FROM member), ");
			buff.append("		?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			
			String sql = buff.toString();
			
			// PreparedStatement 준비
			pstmt = con.prepareStatement(sql);
			/*
			 	pstmt 는 전달하려는 질의명령의 구조만 가지고 있다.
			 	따라서 질의명령을 실행할 때는
			 	데이터들이 채워져야 질의명령이 완성이 될 것이ㅏㄷ.
			 	결국 질의명령을 보내개ㅣ 직전에 데이터를 채워서
			 	질의명령을 완성시켜줘야 한다.
			 */
			
			// 질의명령 완성하기(데이터 채우기)
			/*
			 	데이터를 채울때 위치값은 ? 의 순서를 쓰면 된다. 
			 	데이터 타입은 자바에서 사용하는 타입을 쓰면된다.
			 */
			pstmt.setString(1, ys.getName());
			pstmt.setString(2, ys.getId());
			pstmt.setString(3, ys.getPw());
			pstmt.setString(4, ys.getMail());
			pstmt.setString(5, ys.getTel());
			pstmt.setString(6, ys.getGen());
			pstmt.setInt(7, ys.getAno());
			
			// 이제 질의명령이 완성이 됬으므로 전달하면 된다.
			int cnt = pstmt.executeUpdate();
			//이때 pstmt 에는 이미 완성된 질의명령이 들어있으므로
			// 함수 호출시 질의명령을 이력하지 않아도 된다.
			
			if(cnt == 1) {
				System.out.println("가입 성공");
			} else {
				System.out.println("용기를...");				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try{
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new AddMemb();

	}

}
