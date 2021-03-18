package db;

/*
 	�� Ŭ������ ������ JDBC �۾��� �Ҷ� �ʿ��� ������ ��ǰ�� ���� �����̴�.
 	��, JDBC �۾��� �ݺ����� �۾��� ���� ���ԵǾ� �ִ�.
 	
 	�� �۾��� ���� ���ϰ� �ϱ� ���ؼ�
 	������ ��ǰ�� ���� ����� �����̴�.
 	(==> �ݺ� �۾��� �ڵ����� ���ִ� ����� ���� ����....)
 */

import java.sql.*;
public class MyJDBC {
	/*
	 	������ �� ��ǰ�� �ʿ��ؼ� new ��Ű��
	 	������ �Լ��� ����� ���̰�
	 	1.���� �� ������ ����̹��� �ε��ϴ� �۾��� �ڵ����� ���ְ� �ûQ.
	 	
	 	2.������ �����ּҿ� �����̸�, ��й�ȣ�� �Է��ؼ� new��Ű��
	 	�� ������ ����ϰ� ����̹��ε��� �ϴ� �۾��� �ڵ����� ���ֵ��� �ϰ� �ʹ�.
	 */
	String url, id, pw;
	
	public MyJDBC() {
		// hello �������� �� Ŭ������ ��ü�� ������ִ� ������ �Լ�
		this("jdbc:oracle:thin:@localhost:1521:xe", "hello", "hello");

	}
	
	public MyJDBC(String url, String id, String pw) {
		try {
			// ����̹� �ε��ϰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ���� ����̹� �ε��� ������ ���� �� Ŭ������ ����������� ����� ���̴�.
			// ���� url, id, pw ����ϴ� �۾��� �ʿ���� �ȴ�.
			// ����̹��� �ε��� �����ϸ� ����ϵ��� �ڵ��ϵ��� �Ѵ�.
			
			this.url = url;
			this.id = id;
			this.pw = pw;
										
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Connection �� ��ȯ���ִ� �Լ�
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// Statement ��ȯ �Լ�
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
			 	* ResultSet �� Ÿ�� A
			 		1) Type_FORWARD_ONLY 	    : scroll�� �Ұ����� forward only ��
			 		2) TYPE_SCROLL_INSENSITIVE  : scroll�� �����ϳ� ����� ������ ������� ����
					3) TYPE_SCROLL_SENSITIVE	: scroll�� �����ϰ� ����� ���׵� ����ȴ�.
					
				* ResultSet �� Ÿ�� B
				 	1) CONCUR_READ_ONLY			: ResultSet �� ������ �Ұ���
				 	1) CONCUR_UPDATABLE			: ResultSet �� ������ ����
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;	
	}
	
	// PreparedStatement ��ȯ���ִ� �Լ�
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		
		try {
			pstmt =  con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	// ����ϴ� �ڿ� ��ȯ���ִ� �Լ�
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();				
			}else if(o instanceof Statement) {
				((Statement) o).close();
			}else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
