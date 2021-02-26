package day10.ex;

import java.util.Arrays;

/*
���� 4 ]
	1. ������ �Է��ϸ� �� ������ �ش��ϴ� 
		�ﰢ�� �迭�� ����� �迭�� ��ȯ���ִ� �Լ�
	2. �迭�� �Է��ϸ� �迭�� �ﰢ������ 
		�غ�, ���� �� �����ϰ� �������ִ� �Լ�
	3. �迭�� �Է��ϸ� �迭�� �ﰢ������ 
		���̸� �Է����ִ� �Լ�
	4. �迭�� �Է��ϸ� �迭�� �ﰢ������ ������ ������ִ� �Լ�
		�غ� - 0000
		���� - 0000
		���� - 0000
	5. �迭�� ������ �Է��ϸ� �迭�� ���� ��ġ�� �ﰢ����
		������ ������ִ� �Լ�
		
	�� ���� �����ϼ���.
 */
public class Ex04 {
			
	public Ex04() {
		int[][]tr = set1(5);
		
		set2(tr);	
		
		for(int[] a : tr) {
			System.out.println(Arrays.toString(a));
		}		
		set3(tr);
		
		set4(tr);
		
		set5(tr, 3);
		
	}
	public static void main(String[] args) {
		new Ex04();

	}
	int[][] set1(int a) {
		int[][] try1 = new int[a][3];
		return try1;
	}
	
	void set2(int[][] a) {
		for(int i = 0; i < a.length; i++ ) {
			for(int j = 0; j < a[i].length-1; j++ ) {
				int no = (int)(Math.random()*9 + 1);
				a[i][j] = no;	
			}
		}
	}
	void set3(int[][] a) {
		for(int i = 0; i < a.length; i++ ) {
			a[i][2] = a[i][0] * a[i][1];			
		}
	}
	
	void set4(int[][] a) {
		
		for(int i = 0; i < a.length; i++ ) {
			System.out.println("--------" + i + " ��° �ﰢ�� -----------");
			System.out.println("�غ�" + " - " + a[i][0]);
			System.out.println("����" + " - " + a[i][1]);
			System.out.println("����" + " - " + a[i][2]);
		}
	}
	
	void set5(int[][] a, int b) {
		System.out.println("--------" + b + " ��° ��ġ�� �ﰢ�� -----------");
		System.out.println("�غ�" + " - " + a[b][0]);
		System.out.println("����" + " - " + a[b][1]);
		System.out.println("����" + " - " + a[b][2]);
	}
}
