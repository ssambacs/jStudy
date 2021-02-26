package day10.ex;

import java.util.Arrays;

/*
 	문제2
 		2차원 정수 배열의 멤버변수 score 를 만들고(10 학생 5과목)
 		
 		1. score에 점수를 랜덤하게 입력하는 함수
 		2. score에 입력된 점수를 더해서 총점을 계산해주는 함수
 		3. score의 학생들을 총점을 기준으로 내림차순 정렬해주는 함수
 		
 		를 제작해서 실행하고 결과를 출력하세요.
 */
public class Ex02 {
	
	int[][] score = new int[10][6];
	
	public Ex02() {
		setScore();
		System.out.println("-------------점수---------------");
		for(int[] a : score) {
			System.out.println(Arrays.toString(a));			
		}
		
		sum();
		System.out.println("------------총점---------------");
		for(int[] b : score) {
			System.out.println(Arrays.toString(b));			
		}
		
		
		soo();
		System.out.println("-------------정렬-------------");
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
