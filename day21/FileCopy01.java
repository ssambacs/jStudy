package day21;

/*
	������ �����ϴ� ���α׷��� ������.
 */
import java.io.*;
public class FileCopy01 {

	public FileCopy01() {
		// ����
		// ��Ʈ���� �ܹ����̴�.
		// ����� �Ѱ����� �о �ٸ����� �״�� ����ȴ�.
		// ���� ��Ʈ���� �ΰ� �غ�Ǿ�� �Ѵ�.
		FileInputStream fin = null;		// ����
		FileOutputStream fout = null;	// ���纻
		
		try {
			// ��Ʈ���� �����
			fin = new FileInputStream("D:\\class\\java\\example\\day21\\jenny.jpg");
			fout = new FileOutputStream("src/day21/jenny.jpg");
			
			// �Ѱ����� �о �״�� �ٸ����� ����.
			// ��� �о�� ���� �𸥴�.
			while(true) {
				// byte �迭 �غ��ϰ�
				byte[] buff = new byte[1024];
				// �о �迭�� ����ϰ�
				int len = fin.read(buff);
				if(len == -1) {
					break;
				}
				fout.write(buff, 0, len);
			}
			System.out.println("���� �Ϸ�");
		} catch(Exception e) {
			
		} finally {
			try {
				fout.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileCopy01();
	}

}
