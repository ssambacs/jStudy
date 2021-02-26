package day10;

/*
 	세 수(정수)를 입력하면 세 수를 더한 결과를 알려주는 함수(add01)를 정의하고
 	숫자를 랜덤하게 세개를 발생시켜서 결과(정수)를 출력하는 프로그램을 작성하세요
 */
public class Test02 {

	public Test02() {
		// 정수 세개를 랜덤하게 준비
		int no1 = (int)(Math.random()*10 +1);
		int no2 = (int)(Math.random()*10 +1);
		int no3 = (int)(Math.random()*10 +1);
		
		// 세수의 계산을 담을 변수 준비
		int result = add01(no1, no2, no3);
		
		// 결과 출력
		System.out.println("3개의 숫자 "+ no1 +", " + no2+ ", "+ no3 +" 를 더한 결과는 " + result + " 입니다." );
	}
	
	public static void main(String[] args) {
		new Test02();

	}
	
	// 세수를 더하는 기능의 함수
	int add01(int a, int b, int c) {
		// 반환값 변수 준비
		int result = 0;
		
		// 세 수 계산해서 반환값 변수에 대입하고
		result =  a + b + c;
		
		
		// 결과 반환하고
		return result;
	}
}
