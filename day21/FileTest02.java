package day21;

/*
 	doc ������ ������ ����� �˾Ƴ���.
 */

import java.io.*;
public class FileTest02 {

	public FileTest02() {
		// ����� �˾Ƴ��� ���� ������ ���Ϸ� �����.
		File dir = new File("doc");
		
		/*
		// ��� ����Ʈ ���ϱ�.
		String[] flist = dir.list();
		// ���
		for(int i = 0; i < flist.length ; i++) {
			System.out.println(flist[i]);
		}
		*/
		/*
		// ���� �����ؼ� ����Ʈ ���ϱ�
		File[] flist = dir.listFiles();
		for(int i = 0; i < flist.length ; i++) {
			File fileInfo = flist[i];
			String fileName = fileInfo.getName(); //�����̸� �����ִ� �Լ�
			long len = fileInfo.length(); // ������ ������ ��ȯ���ִ� �Լ�
			//���
			System.out.println(fileName + " - " + len);
		}
		*/
		
		// Ȯ���ڰ� .txt �� �͸� ��� ����غ���.
		String[] list = dir.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				/*
				 	�Ű����� ����
				 		File dir		- ���� ������ ������ �˷��ְ�
				 		String name 	- ���� ������ �̸��� �˷��ش�.
				 		
				 		�� �Լ��� �ڵ� ȣ���Լ��̴�.
				 		list() �Լ��� ȣ��ɶ� �ڵ����� ȣ��Ǵ� �Լ��̴�.
				 		����� ���ϴ� ������ �ϳ��� �߰��� ������ �� �Լ��� ȣ��ȴ�.
				 		��ȯ���� 		true  �̸� ��Ͽ� ���Խ�Ű��
				 					false �̸� ��Ͽ��� ���ܽ�Ų��.
				 */
				if(name.endsWith("txt")) {
					return true;
				}
				return false;
			}
			
		});
		
		//���
		for(int i = 0; i < list.length ; i++) {
			String fileName = list[i];
			System.out.println(fileName);
		}
	}

	public static void main(String[] args) {
		new FileTest02();

	}

}
