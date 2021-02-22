package day06.ex;

/*
 	 5자리 숫자를 랜덤하게 발생
 	 각 자리 숫자의 합을 구하는 프로그램
 */

public class Ex03 {
	public static void main(String[] args) {
		int num = (int)(Math.random()* 90000 - 10000);
		int no = num;
		int result = 0;
		int no2 = 0;
		for(int i = 0 ; i < 5 ; i++) {
			
			no2 = no % 10;			
			result = result + no2;			
			no = no / 10;
			
		}
		System.out.println(num + " 의 각자리 합은 : " +result);
	}
}
