package day21;

/*
 	1. D:\ ���� �ϳ��� ������ ������
 	2. D:\  ������ ������ ������ ������
 	3. ������� ������ �ϳ��� ��������.(���� ������ ����, ���� ������ ����)
 */
import java.io.*;
public class FileTest01 {

	public FileTest01() {
		// ����� ���� ����(��� ��� ����.) ���Ϸ� ������
		/*
		//1.
		File file = new File("D:\\example");
		file.mkdir();
		*/
		
		/*
		//2.
		File file = new File("D:\\class\\java\\example\\day20");
		file.mkdirs();
		*/
		
		/*
		//3.
		File file = new File("D:\\example");
		file.delete();
		*/
		
		// Ư�� ������ �̸��� �ٸ� �̸����� ��������.
		// �۾� ����
		// 1. ���� ���ϰ� �ٲ��̸��� ������ �Ѵ� File�� �����.
		File oldFile = new File("D:\\class\\java\\example\\day20");
		File newFile = new File("D:\\class\\java\\example\\day21");
		// 2. �ٲ۴�
		oldFile.renameTo(newFile);
	}

	public static void main(String[] args) {
		new FileTest01();
	}

}
