package day21;


/*
 	Ű���带 �̿��ؼ� ���ڸ� �Է� �޾ƺ���
 */

import java.io.*;
import java.util.*;

public class InputTest01 {

	public InputTest01() {
	
		/*
		 	����
		 		Ű���� ���� �ܺ���ġ�̴�.
		 		���� ����ϴ� �ܺ���ġ�̱� ������
		 		�̹� ��Ʈ���� �غ��� ������ �����Ѵ�.
		 		�װ��� �ٷ� 
		 			System.in
		 		�̴�.
		 */
		
		int ch = 0;
		
		try {
			/*
			//1.
			System.out.print("�ѱ��� �Է� : ");
			ch = System.in.read();
			//���
			System.out.println("�Է��� ����1 : " + (char)ch);
			System.out.println("�Է��� ����2 : " + ch);
			*/
			
			/*
			// 2. ���ڿ� �Է�
			System.out.print("������ �Է� : ");
			// ���� ����� ����� ������ �غ��Ѵ�.
			byte[] buff = new byte[256];
			// �̶� 256�̶�� �Է��� �κ��� ���ڿ� ���� �ѹ��� ���� �������� ���� ������ �ȴ�.
			int len = System.in.read(buff);
			// ���� ����� ���ڷ� ��ȯ�ؼ� ���....
			String str = new String(buff, 0, len);
			System.out.println("�Է��� ���ڿ� : " + str);
			*/
			
			// 3. �ַ� ��Ʈ��ũ ó���Ҷ� ���� ����ϴ� ��� 
			System.out.print("������ �Է� : ");
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			int len = System.in.read(buff, 10, 100);
			/*
			 	�غ�� �迭 buff�� 10������� ���� ������ ����ϼ���
			 	�ִ� 100�������� ��������.(==> 100�ڸ� �Է¹޴´�.)
			 */
			 String str = new String(buff, 0, len + 10);
			 System.out.println("�Է��� ���ڿ� :" + str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InputTest01() ;

	}

}
