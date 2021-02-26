package day10.ex;

import java.util.Arrays;

/*
문제 4 ]
	1. 정수를 입력하면 그 정수에 해당하는 
		삼각형 배열을 기억할 배열을 반환해주는 함수
	2. 배열을 입력하면 배열의 삼각형들의 
		밑변, 높이 를 랜덤하게 셋팅해주는 함수
	3. 배열을 입력하면 배열의 삼각형들의 
		넓이를 입력해주는 함수
	4. 배열을 입력하면 배열의 삼각형들의 내용을 출력해주는 함수
		밑변 - 0000
		높이 - 0000
		넓이 - 0000
	5. 배열과 정수를 입력하면 배열의 정수 위치의 삼각형의
		정보를 출력해주는 함수
		
	를 만들어서 실행하세요.
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
			System.out.println("--------" + i + " 번째 삼각형 -----------");
			System.out.println("밑변" + " - " + a[i][0]);
			System.out.println("높이" + " - " + a[i][1]);
			System.out.println("넓이" + " - " + a[i][2]);
		}
	}
	
	void set5(int[][] a, int b) {
		System.out.println("--------" + b + " 번째 위치의 삼각형 -----------");
		System.out.println("밑변" + " - " + a[b][0]);
		System.out.println("높이" + " - " + a[b][1]);
		System.out.println("넓이" + " - " + a[b][2]);
	}
}
