package sql;

/*
 	이 클래스는 회원테이블의 데이터베이스 작업에 필요한 
 	질의명령을 모아놓고 누군가 요청하면 질의명령을 반환해주는
 	기능을 가진 클래스...
 */

public class MemberSQL {
	public final int SEL_ALL = 1001;
	public final int SEL_ID_INFO = 1002;
	
	public final int EDIT_MEMB = 2001;
	
	public final int ADD_MEMB = 3001;
	
	// 필요한 질의 명령이 생기면 위에 코드를 만들고 이때 코드값은 다르게 지정한다.
	// 만든 코드에 해당하는 질의명려을 case문에 추가해주면 된다.

	// 위의 코드값에 해당하는 질의명령을 요구하면
	// 해당 질의명령을 반환해주는 함수
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("    mno, name, id, mail, tel, gen, avt ano, joindate ");
			buff.append("FROM ");
			buff.append("    member ");
			buff.append("WHERE ");
			buff.append("    isshow = 'Y' ");
			break;
		case SEL_ID_INFO:
			buff.append("SELECT ");
			buff.append("    mno, name, id, mail, tel, gen, avt ano, joindate ");
			buff.append("FROM ");
			buff.append("    member ");
			buff.append("WHERE ");
			buff.append("    isshow = 'Y' ");
			buff.append("    id = ? ");
			break;
		case EDIT_MEMB:
			buff.append("UPDATE ");
			buff.append("    member ");
			buff.append("SET ");
			buff.append("    avt = ? ");
			buff.append("WHERE ");
			buff.append("    id = ? ");
			break;
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("		(SELECT NVL(MAX(mno)+1, 1001) FROM member), ");
			buff.append("		?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
			
		}
		
		return buff.toString();
	}
	
}
