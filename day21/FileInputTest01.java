package day21;


import java.io.*;
public class FileInputTest01 {

	public FileInputTest01() {
		// ����
		// 1. ���Ͽ� ����� Ÿ�ٽ�Ʈ�� �غ�
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src\\day21\\InputTest01.java");
			
			/*
			//1. �ѱ��ڸ�  �о��
			int ch = fin.read();
			System.out.println((char) ch);
			*/
			
			/*
			//2. �������ڸ� ��������.
			byte[] buff = new byte[1024];
			int len = fin.read(buff);
			String str = new String(buff, 0, len);
			System.out.println(str);
			*/
			
			//3. ���� ��ü ������ �о��
			// �̶� ����ڸ� �о�� ���� �𸣹Ƿ� �ݺ������� ó��
			while(true) {
				// �ϴ� �ѹ� ���緮�� �о��.
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				// �̶� ��ȯ���� ���� ������ �����̴�. 
				// -1 �� ��ȯ�� ���� ���̻� ���� �����Ͱ� ���� ����̴�.
				// ���� �� �ݺ����� �����Ѵ�.
				if(len == -1) {
					break;
				}
				//���� ������ŭ ���ڿ��� �����				
				String str = new String(buff, 0, len);
				//���
				System.out.print(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileInputTest01();

	}

}
