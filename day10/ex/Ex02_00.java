package day10.ex;

import java.util.Arrays;

/*
 	5과목의 점수를 랜덤하게 발생시켜서 배열로 반환해주는 함수를 작성
 	실행해서 결과를 출력하세요.
 	
 	전역변수로 배열변수를 만들어서 실행하는 것이 아닙니다.
 	
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
