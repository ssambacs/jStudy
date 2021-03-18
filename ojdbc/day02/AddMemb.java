package ojdbc.day02;

import java.sql.*;
public class AddMemb {
	Connection con;
	PreparedStatement pstmt;
	public AddMemb() {
		MemberVO ys = new MemberVO();
		//����� ȸ�� ������ �߰�
		ys.setName("�����");
		ys.setId("kieun");
		ys.setPw("12345");
		ys.setMail("kieun@increpas.com");
		ys.setTel("010-5555-5555");
		ys.setGen("M");
		ys.setAno(13);
		
		// �����ͺ��̽� �۾�
		try {
			//����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ŀ�ؼ� ������
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hello";
			String pw = "hello";
			
			con = DriverManager.getConnection(url, id, pw);
			
			// ���Ǹ�� �ۼ�
			
			StringBuffer buff = new StringBuffer();
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("		(SELECT NVL(MAX(mno)+1, 1001) FROM member), ");
			buff.append("		?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			
			String sql = buff.toString();
			
			// PreparedStatement �غ�
			pstmt = con.prepareStatement(sql);
			/*
			 	pstmt �� �����Ϸ��� ���Ǹ���� ������ ������ �ִ�.
			 	���� ���Ǹ���� ������ ����
			 	�����͵��� ä������ ���Ǹ���� �ϼ��� �� ���̤���.
			 	�ᱹ ���Ǹ���� �������� ������ �����͸� ä����
			 	���Ǹ���� �ϼ�������� �Ѵ�.
			 */
			
			// ���Ǹ�� �ϼ��ϱ�(������ ä���)
			/*
			 	�����͸� ä�ﶧ ��ġ���� ? �� ������ ���� �ȴ�. 
			 	������ Ÿ���� �ڹٿ��� ����ϴ� Ÿ���� ����ȴ�.
			 */
			pstmt.setString(1, ys.getName());
			pstmt.setString(2, ys.getId());
			pstmt.setString(3, ys.getPw());
			pstmt.setString(4, ys.getMail());
			pstmt.setString(5, ys.getTel());
			pstmt.setString(6, ys.getGen());
			pstmt.setInt(7, ys.getAno());
			
			// ���� ���Ǹ���� �ϼ��� �����Ƿ� �����ϸ� �ȴ�.
			int cnt = pstmt.executeUpdate();
			//�̶� pstmt ���� �̹� �ϼ��� ���Ǹ���� ��������Ƿ�
			// �Լ� ȣ��� ���Ǹ���� �̷����� �ʾƵ� �ȴ�.
			
			if(cnt == 1) {
				System.out.println("���� ����");
			} else {
				System.out.println("��⸦...");				
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
