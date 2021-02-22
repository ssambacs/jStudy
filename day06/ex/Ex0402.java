package day06.ex;
/*
 2.
 		두자리의 랜덤한 숫자 10개를 발생시켜서 합을 구하는 프로그램을 작성하세요
 */
public class Ex0402 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()*90 +10);
		int no2 = (int)(Math.random()*90 +10);
		
		int sum = no1 + no2;
		System.out.println(no1 + " + " + no2 + " = " +sum);
		
	}
}
