package day21;

import java.io.*;

/*
 	���Ͽ� �����ϴ� ���α׷��� �ۼ��ϼ���
 	��, Buffered ��Ʈ���� ����ϼ���.
 */
public class BufferedTest01 {

	public BufferedTest01() {
		// 1. �ݵ�� Ÿ��(�⺻) ��Ʈ���� �ʿ��ϴ�.
		FileOutputStream fout = null;
		// 2. �ʿ信 ���� ����(����)��Ʈ���� ������ �� �ִ�.
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day21/buffTest.txt");
			bout = new BufferedOutputStream(fout);
			
			String str = "�̰��� ���Ͽ� �����ϴ� ���α׷��� �����\nBufferedOutputStream ���...";
			byte[] buff = str.getBytes();
			bout.write(buff);
			/*
			 	���� ���۰� ���� �ʾ����Ƿ� ������ ������ FileOutputStream ���� ���޵��� �ʾҴ�.
			 	���� ������ ���������� ���� ���� ���� �ִ�.
			 	
			 	�ݵ�� ���������� �Ϸ�� �������� ���۸� ���� ������ ������ �ڴ�.
			 */
			bout.flush();
			
			System.out.println("����Ϸ�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedTest01();

	}

}
