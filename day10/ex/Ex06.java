package day10.ex;

import java.util.Arrays;

/*
���� 6 ]
	5���� ���ڸ� �����ϴ� �迭�� �Է¹޾Ƽ� �迭�� ���� ��� ���ڸ� ���ϴ� ����� 
	�Լ��� �����ϰ� ����� ����ϼ���.
	
	1. �迭�� �Է����ָ� �հ踦 ��ȯ���ִ� �Լ�
	
	�߰��۾� ]
		�� �濡 ���ڸ� �������ִ� �Լ�
		������ �Է��ϸ� ������ŭ�� ������ ����ϴ� �迭�� ���� ��ȯ���ִ� �Լ�
		
		�迭�� ���ڸ� �Է��ϸ� �迭�� ����� ���ڸ� ������ִ� �Լ�
*/
public class Ex06 {

	public Ex06() {
		int[] num = setNo();
		
		System.out.println(Arrays.toString(num));
		System.out.println(sum(num));
		
		//�迭 ��ȯ
		int[] num1 = getArray(10);
		System.out.println(Arrays.toString(num1));
		
		num1 = setData(num1);
		System.out.println(Arrays.toString(num1));
		System.out.println(sum(num1));
	}

	public static void main(String[] args) {
		new Ex06();
	}
	
	public int[] setNo() {
		int[] a = new int[5]; 
		for(int i = 0 ; i < 5 ; i++) {
			a[i] =(int)(Math.random()*10);			
		}
		return a;
	}
	public int sum(int[] a) {
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++) {
			sum += a[i];			
		}
		return sum;		
	}
	
	public int[] getArray(int cnt) {
		return new int[cnt];	
	}
	
	public int[] setData(int[] a) {
		for(int i = 0 ; i < a.length ; i++) {
			a[i] =(int)(Math.random()*10);			
		}
		return a;
	}
}
