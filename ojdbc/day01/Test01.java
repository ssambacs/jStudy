package ojdbc.day01;

/*
	����Ŭ�� SCOTT ������ �����ؼ�
	emp ���̺��� ����Ѹ��� �����͸� ��ȸ�غ���.
 */

import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.text.*;
public class Test01 {
/*
	1. JDBC�� �ܺ� �����ͺ��̽��� ������ ����̹��� ���α׷����� ������ �;��Ѵ�.
		�ܺ� Ŭ������ �ε��ϴ� �Լ�
			
			Class.forName(���.Ŭ�����̸�)
		�̶� �� ����̹����� �ܺ� Ŭ������ �̸��� ���ݾ� �ٸ���.
		�̰�� �˻��ؼ� �ܺ�Ŭ�����̸��� ����ϸ� �ȴ�.
		
	2. ����Ŭ�� ������ �õ��Ѵ�.
		������ �����ͺ��̽����� �����ϴ� ���(URL)�� �ణ�� �ٸ���.
		�̶� ���� �˻��ؼ� ó��....
		
		�����ϴ� ��ɾ�� JDBC���� ��ɸ� �ϸ� �ȴ�.
			���� ��� ]
				DriverManager.getConnection();
			
			����Ŭ������ ������ ����(Session)�̶�� �ҷ�����
			JDBC������ Ŀ�ؼ�(Connection)�̶�� �θ���.
 */
	public Test01() {
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
				�ش� ����̹��� �̿��ؼ� ������ �õ��Ѵ�.
			 */
			System.out.println("***** ����̹� �ε� ���� *****");
			
			// 2. ���ӽõ�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// url ���� �����ͺ��̽����� ���ݾ� �޶�����.
			String id = "SCOTT";
			String pw = "TIGER";
			
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("##### scott ���� ���� ���� #####");
			/*
				��ó�� ������ �ϸ�
				�����ڸ� �����ϴ� ������ �����ϰ� �ȴ�.
				�� ������ �����ϴ� Ŭ������ Connection �̴�.
				
				��������� �����ͺ��̽����� ���ݾ� �ٸ� �����̴�
				
				�� ���ĺ��ʹ� �׻� ������ ������� 
				JDBC���� ����� ������ 
				JDBC�� �˾Ƽ� �ش� DBMS���� ����� �����Ѵ�.
			 */
			
			// ���Ǹ���� ��������.
			// SCOTT ����� ������ ��ȸ�ؼ� ����غ���.
			
			/*
				JDBC���� ���Ǹ���� ���� �Ҷ���
				Statement �� �����ؾ� �Ѵ�.
			 */
			Statement stmt = con.createStatement();
			// ���� ���Ǹ���� ��Ƽ� ���� ������ �غ� �Ǿ��ִ�.
			
			// ���Ǹ�� �ۼ�
			String sql = "SELECT * FROM emp WHERE ename = 'SCOTT'";
			/*
				
				*****
				���� ]
					JDBC������ ���Ǹ���� ; ���� �������� �ʴ´�.
					�־��ָ� ������ ����.
			 */
			
			// Statement�� ���Ǹ���� �Ǿ JDBC�� �����Ѵ�.
			ResultSet rs = stmt.executeQuery(sql);
			/*
				���� ]
					ResultSet
						==> ��ȸ ���Ǹ��(SELECT ���) �� ��ȸ ����� �����ϴ� Ŭ����
			 */
			
			// �����͸� ������
			// ���� �����͸� ���� ������ �̵��ؾ� �Ѵ�.
			// 		��� ] rs.next();
			rs.next();
			
			String name = rs.getString("ename");
			int eno = rs.getInt("empno");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int dno = rs.getInt("deptno");
			
			// JDBC������ ��¥�� �ð��� ���� �������� �Լ����� ������� �ִ�.
			Date hdate = rs.getDate("hiredate");
			Time htime = rs.getTime("hiredate");
			
			// ��¥ �����͸� ���ڿ��� ��ȯ���ش�.
			SimpleDateFormat form1 = new SimpleDateFormat("yyyy��MM��dd�� ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			
			String sdate = form1.format(hdate) + form2.format(htime);
			
			// ����Ѵ�.
			System.out.println("�����ȣ : " + eno);
			System.out.println("����̸� : " + name);
			System.out.println("������� : " + job);
			System.out.println("����ȣ : " + mgr);
			System.out.println("����޿� : " + sal);
			System.out.println("Ŀ  ��  �� : " + comm);
			System.out.println("�μ���ȣ : " + dno);
			System.out.println("��  ��  �� : " + sdate);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
