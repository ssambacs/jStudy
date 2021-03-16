package day21;

/*
 	���Ͽ� ģ���� ������ ��������
 	������ ������ 
 		�̸� : String
 		���� : int
 		���� : double
 		���� : boolean
 		��ȭ : String
 		���� : String
 */

import java.io.*;
public class DataOutputTest01 {

	public DataOutputTest01() {
		//1. Ÿ�ٽ�Ʈ�� �غ�
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		
		try {
			// ��Ʈ�� �����
			fout = new FileOutputStream("src/day21/data/friend.txt");
			dout = new DataOutputStream(fout);
			
			// ������ �غ�
			String name = "����";
			int age = 26;
			double height = 170.0;
			boolean gen = true;
			String tel = "010-1111-1111";
			String mail = "jenny@increpas.com";
			
			// DataOutputStream / DataInputStream�� Ư¡�� �ڹ��� ������Ÿ���� ��ȯ���� ����Ҽ� �ִ�.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			dout.writeBoolean(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new DataOutputTest01();

	}

}
