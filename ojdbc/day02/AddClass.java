package ojdbc.day02;


/*	
 	자바에서 db 작업처리순서
 	
 	1.드라이버로딩
 	2. 커넥션꺼내오고
 	3. 질의명령 가져오고(따로 클래스 제작후 함수로...)
 	4. Statement, prepredStatement 준비
 	5. 미완성 질의명령을 완성해주기.
 	6. 질의명령 보내고 결과받고 (ReultSet)
 	7. 결과에 따른 처리
 	8. 자원반환(장치에 연결했으면 반드시 반환해줘야 한다.) 
 */
import java.sql.*;
import java.util.*;

import db.*;
import sql.*;
public class AddClass {
	MyJDBC db;
	Connection con;
	PreparedStatement pstmt;
	
	MemberSQL mSQL;
	
	
	public AddClass() {
		// 데이터베이스 사용준비
		db = new MyJDBC();
		// 이 명령이 정상적으로 실해잉 되면 드라이버 로딩은 이미 끝난 상태이다.
		// + url, id. pw 도 기억시켜놓은 상태이다.
		// 따라서 필요한 Connection, Statement, PreparedStatement 가 있으면
		// 그때마다 함수를 호출해서 꺼내오면 되겠다.
		
		// 커넥션 꺼내오고
		con = db.getCon();
		
		mSQL = new MemberSQL(); // 사용할 질의명령을 꺼낼 준비가 됬다.
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		
		// PreparedStatement  꺼내오고
		pstmt = db.getPSTMT(con, sql); 
		
		// 회원 데이터 가져오고
		ArrayList<MemberVO> list = getList();
		
		int cnt = 0;
		try {
			// 질의명령의 ? 대신 데이터를 채워서 완성하고
			// 다섯명의 데이터를 입력할 예정이므로 반복해서 처리한다.
			for(int i =0; i< list.size(); i++) {
				// 리스트에서 데이터 꺼내고
				MemberVO mVO = list.get(i);
				pstmt.setString(1, mVO.getName());
				pstmt.setString(2, mVO.getId());
				pstmt.setString(3, mVO.getPw());
				pstmt.setString(4, mVO.getMail());
				pstmt.setString(5, mVO.getTel());
				pstmt.setString(6, mVO.getGen());
				pstmt.setInt(7, mVO.getAno());
				// 이제 질의명령이 완성이 됐으므로 JDBC에게 전달하면 된다.
				
				cnt += pstmt.executeUpdate();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		if(cnt == list.size()) {
			System.out.println(list.size() + " 명의 회원 등록 완료");
		} else {
			System.out.println(" 문제가 있습니다. ");			
		}
	}
	
	// 다섯명의 정보를 반환해주는 함수
	public ArrayList<MemberVO> getList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		MemberVO m1 = new MemberVO();
		m1.setName("고길동");
		m1.setId("go");
		m1.setPw("12345");
		m1.setMail("go@increpas.com");
		m1.setTel("010-1111-1111");
		m1.setGen("M");
		m1.setAno(14);
		
		list.add(m1);
		
		MemberVO m2 = new MemberVO();
		m2.setName("허수경");
		m2.setId("soo");
		m2.setPw("12345");
		m2.setMail("sdo@increpas.com");
		m2.setTel("010-2222-2222");
		m2.setGen("F");
		m2.setAno(15);
		
		list.add(m2);
		
		MemberVO m3 = new MemberVO();
		m3.setName("한수연");
		m3.setId("sy");
		m3.setPw("12345");
		m3.setMail("sy@increpas.com");
		m3.setTel("010-3333-3333");
		m3.setGen("F");
		m3.setAno(15);
		
		list.add(m3);
		
		MemberVO m4 = new MemberVO();
		m4.setName("최태현");
		m4.setId("choi");
		m4.setPw("12345");
		m4.setMail("choi@increpas.com");
		m4.setTel("010-6666-6666");
		m4.setGen("M");
		m4.setAno(12);
		
		list.add(m4);
		
		MemberVO m5 = new MemberVO();
		m5.setName("조희섭");
		m5.setId("sub");
		m5.setPw("12345");
		m5.setMail("sub@increpas.com");
		m5.setTel("010-9999-9999");
		m5.setGen("M");
		m5.setAno(11);
		
		list.add(m5);

		return list;
	}
	public static void main(String[] args) {
		new AddClass();
	}

}
