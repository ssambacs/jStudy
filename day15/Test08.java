package day15;

import java.util.*;
public class Test08 {

	public Test08() {
		/*
		 ���� �ð��� ����غ���.
		 �ڹٿ��� ��¥�� �����ϴ� Ŭ������
		 	Date ��� Ŭ������ ������
		 ����� calendar ������ Ŭ������ ���������
		 �� Ŭ������ ����ϱ⸦ �����ϰ� �ִ�.		  
		 */
		/*
		Date date = new Date();
		// ��¥ ���
		System.out.println(date.getDate()); // �� �Լ��� Deprecated �Ǿ��ִ� �Լ��̰� �ǵ����̸� ������� ����
		System.out.println(date.getDay());
		*/
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
