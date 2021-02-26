package day10.ex;

import java.util.Arrays;

/*
문제 6 ]
	5개의 숫자를 관리하는 배열을 입력받아서 배열에 기억되 모든 숫자를 더하는 기능의 
	함수를 제작하고 결과를 출력하세요.
	
	1. 배열을 입력해주면 합계를 반환해주는 함수
	
	추가작업 ]
		각 방에 숫자를 셋팅해주는 함수
		정수를 입력하면 정수만큼의 정수를 기억하는 배열을 만들어서 반환해주는 함수
		
		배열과 숫자를 입력하면 배열의 내용과 숫자를 출력해주는 함수
*/
public class Ex06 {

	public Ex06() {
		int[] num = setNo();
		
		System.out.println(Arrays.toString(num));
		System.out.println(sum(num));
		
		//배열 반환
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
