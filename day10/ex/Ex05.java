package day10.ex;

/*

문제 5 ]
	두 수를 이용해서 더하는 프로그램을 작성하세요.
		
		1. 랜덤한 숫자를 반환해주는 함수
		2. 숫자 두개를 입력하면 더해준 값을 반환해주는 함수
		3. 출력해주는 함수
		
	세개의 만든 함수를 이용해서 출력하세요.
 */
public class Ex05 {
	int result;
	public Ex05() {
		
		result = sum(3, 5);
		pr();
	}
	public static void main(String[] args) {
		new Ex05();
	}
	public int num() {
		int no = (int)(Math.random()*10);
		return no;
	}
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	public void pr() {
		System.out.println(result);
	}
}
