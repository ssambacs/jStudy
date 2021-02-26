package day10.ex;

import java.util.Arrays;

/*
 	����2
 		2���� ���� �迭�� ������� score �� �����(10 �л� 5����)
 		
 		1. score�� ������ �����ϰ� �Է��ϴ� �Լ�
 		2. score�� �Էµ� ������ ���ؼ� ������ ������ִ� �Լ�
 		3. score�� �л����� ������ �������� �������� �������ִ� �Լ�
 		
 		�� �����ؼ� �����ϰ� ����� ����ϼ���.
 */
public class Ex02 {
	
	int[][] score = new int[10][6];
	
	public Ex02() {
		setScore();
		System.out.println("-------------����---------------");
		for(int[] a : score) {
			System.out.println(Arrays.toString(a));			
		}
		
		sum();
		System.out.println("------------����---------------");
		for(int[] b : score) {
			System.out.println(Arrays.toString(b));			
		}
		
		
		soo();
		System.out.println("-------------����-------------");
		for(int[] c : score) {
			System.out.println(Arrays.toString(c));			
		}
		
	}
	public static void main(String[] args) {
		new Ex02();

	}
	void setScore() {
		for(int i = 0; i < score.length ; i++ ) {
			for(int j = 0; j < score[i].length - 1 ; j++ ) {
				int no = (int)(Math.random()* 30 + 70);
				score[i][j] = no;				
			}			
		}
	}
	
	void sum() {
		for(int i = 0; i < score.length ; i++) {
			int sum = 0;
			for(int j = 0 ; j < 5 ; j ++) {
				sum += score[i][j];
			}
			score[i][5] = sum;
		}
	}
	
	void soo() {
		for(int i = 0; i < score.length-1 ; i++) {
			for(int j = i + 1 ; j < score.length ; j ++) {
				if(score[i][5] < score[j][5]) {
					int no1 = score[i][5];
					score[i][5] = score[j][5];
					score[j][5] = score[i][5];					
				}
			}			
		}
	}
}
