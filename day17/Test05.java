package day17;

import java.util.*;
public class Test05 {

	public Test05() {
//		int no = null; // �⺻�� �������� null�� ����� �� ����. ������Ÿ�̿��� ����� �� �ִ�.
		
		// ���� 10���� ���� ����غ���.
		Random rdn = new Random(100);
		for(int i = 0 ; i< 10; i++) {
			System.out.print(rdn.nextInt() + ", ");
		}
		System.out.println();
		
		rdn = new Random(100);
		for(int i = 0 ; i< 10; i++) {
			System.out.print(rdn.nextInt() + ", ");
		}
	}

	public static void main(String[] args) {
		new Test05();

	}

}
