package ojdbc.day02;

/*
 	hello ������ member ���̺� �ڿ�� ȸ���� �߰��ϼ���
 	�̸�: �ڿ��
 	���̵�:  ys
 	��й�ȣ: 12345
 	���� : ys@increpas.com
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
			buff.append("		'�ڿ��', 'ys', '12345', 'ys@increpas.com', '010-8888-8888', 'M', 12 ");
			buff.append(") ");
			
			String sql = buff.toString();
			
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			int cnt = stmt.executeUpdate(sql);
			
			if(cnt == 1) {
				System.out.println("����");
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
