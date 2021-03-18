package ojdbc.day01;

/*
	오라클에 SCOTT 계정에 접속해서
	emp 테이블의 사원한명의 데이터를 조회해보자.
 */

import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.text.*;
public class Test01 {
/*
	1. JDBC와 외부 데이터베이스를 연결할 드라이버를 프로그램으로 가지고 와야한다.
		외부 클래스를 로딩하는 함수
			
			Class.forName(경로.클래스이름)
		이때 각 드라이버마다 외부 클래스의 이름이 조금씩 다르다.
		이경우 검색해서 외부클래스이름을 사용하면 된다.
		
	2. 오라클에 접속을 시도한다.
		각각의 데이터베이스마다 접속하는 방법(URL)이 약간씩 다르다.
		이때 역시 검색해서 처리....
		
		접속하는 명령어는 JDBC에게 명령만 하면 된다.
			접속 명령 ]
				DriverManager.getConnection();
			
			오라클에서는 연결을 세션(Session)이라고 불렀지만
			JDBC에서는 커넥션(Connection)이라고 부른다.
 */
	public Test01() {
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
				해당 드라이버를 이용해서 연결을 시도한다.
			 */
			System.out.println("***** 드라이버 로딩 성공 *****");
			
			// 2. 접속시도
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// url 역시 데이터베이스마다 조금씩 달라진다.
			String id = "SCOTT";
			String pw = "TIGER";
			
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("##### scott 계정 접속 성공 #####");
			/*
				이처럼 접속을 하면
				접속자를 관리하는 세션을 제공하게 된다.
				이 세션을 관리하는 클래스가 Connection 이다.
				
				여기까지는 데이터베이스마다 조금씩 다른 내용이다
				
				이 이후부터는 항상 동일한 방식으로 
				JDBC에게 명령을 내리면 
				JDBC가 알아서 해당 DBMS에게 명령을 전달한다.
			 */
			
			// 질의명령을 보내보자.
			// SCOTT 사원의 정보를 조회해서 출력해보자.
			
			/*
				JDBC에게 질의명령을 전달 할때는
				Statement 로 전달해야 한다.
			 */
			Statement stmt = con.createStatement();
			// 이제 질의명령을 담아서 보낼 도구가 준비가 되어있다.
			
			// 질의명령 작성
			String sql = "SELECT * FROM emp WHERE ename = 'SCOTT'";
			/*
				
				*****
				참고 ]
					JDBC에서는 질의명령을 ; 으로 종료하지 않는다.
					넣어주면 에러가 난다.
			 */
			
			// Statement에 질의명령을 실어서 JDBC에 전달한다.
			ResultSet rs = stmt.executeQuery(sql);
			/*
				참고 ]
					ResultSet
						==> 조회 질의명령(SELECT 명령) 의 조회 결과를 관리하는 클래스
			 */
			
			// 데이터를 꺼내서
			// 먼저 데이터를 꺼낼 행으로 이동해야 한다.
			// 		명령 ] rs.next();
			rs.next();
			
			String name = rs.getString("ename");
			int eno = rs.getInt("empno");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int dno = rs.getInt("deptno");
			
			// JDBC에서는 날짜와 시간을 따로 꺼내도록 함수들이 만들어져 있다.
			Date hdate = rs.getDate("hiredate");
			Time htime = rs.getTime("hiredate");
			
			// 날짜 데이터를 문자열로 변환해준다.
			SimpleDateFormat form1 = new SimpleDateFormat("yyyy년MM월dd일 ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			
			String sdate = form1.format(hdate) + form2.format(htime);
			
			// 출력한다.
			System.out.println("사원번호 : " + eno);
			System.out.println("사원이름 : " + name);
			System.out.println("사원직급 : " + job);
			System.out.println("상사번호 : " + mgr);
			System.out.println("사원급여 : " + sal);
			System.out.println("커  미  션 : " + comm);
			System.out.println("부서번호 : " + dno);
			System.out.println("입  사  일 : " + sdate);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
