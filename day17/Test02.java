package day17;

import java.util.*;
public class Test02 {

	public Test02() {
		try{
			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("���� �Է� : ");
				int no = sc.nextInt();
				if(no == 0) {
					// �� ���� ������ MyException ���ܸ� �߻����Ѿ� �Ѵ�.
				throw new MyException();
				} else if(no == -1) {
					break;
				}
				
			}
		} catch(Exception e) {
				System.out.println(e);
		}				
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	public class MyException extends Exception{
		// ���� ���� Ŭ����
		// �� Ŭ������ 0 �� �ԷµǸ� �߻��Ǵ� ����� ���� ���ܸ� ó�����ִ� Ŭ����
		// ���� ������ ������ 0�� �ԷµǾ��ٴ� ���� �˷��ִ� ���� �ǰڴ�.
		public String toString() {
			return "���� : 0�� �ԷµǾ����ϴ�.";
		}
	}
}
