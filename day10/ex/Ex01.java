package day10.ex;

import java.util.Arrays;

/*
 	�������� �Է�(����)�ϸ� �Է��� ������ ���������� �ϴ� ���� 
 	�ѷ�, ���̸� �Ѳ����� ��ȯ���ִ� �Լ�(setCircle)�� ����� �����ؼ� ����� ����ϼ���.
 	�������� 15~45 ���̷� �����ϰ� �Էµǰ� �ϼ���.  
 */
public class Ex01 {
	double pai = 3.14;
	
	public Ex01() {
		int rad = (int)(Math.random()*31 + 15);
		
		double[] result = setCircle(rad);
		
		System.out.println("������ : "+ rad + " �� �ѷ��� ���̴� " + Arrays.toString(result));
		
	}
	public static void main(String[] args) {
		new Ex01();

	}
	double[] setCircle(int a) {
		double[] no = new double[2];
		no[0] = 2* a * pai;
		no[1] = a * a * pai;		
		return no;
	}

}
