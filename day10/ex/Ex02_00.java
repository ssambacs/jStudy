package day10.ex;

import java.util.Arrays;

/*
 	5������ ������ �����ϰ� �߻����Ѽ� �迭�� ��ȯ���ִ� �Լ��� �ۼ�
 	�����ؼ� ����� ����ϼ���.
 	
 	���������� �迭������ ���� �����ϴ� ���� �ƴմϴ�.
 	
 */

public class Ex02_00 {
	
	
	
	
	public Ex02_00() {
		int[] result = setScore();
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		new Ex02_00();

	}
	int[] setScore() {
		int score[] = new int[5];
		for(int i = 0; i < 5 ; i++) {
			score[i] = (int)(Math.random()*30 + 70);
		}
		return score;
	}
}
