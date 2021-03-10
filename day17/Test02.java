package day17;

import java.util.*;
public class Test02 {

	public Test02() {
		try{
			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자 입력 : ");
				int no = sc.nextInt();
				if(no == 0) {
					// 이 경우는 강제로 MyException 예외를 발생시켜야 한다.
				throw new MyException();
				} else if(no == -1) {
					break;
				}
				
			}
		} catch(Exception e) {
				System.out.println(e);
		}				
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	public class MyException extends Exception{
		// 전역 내부 클래스
		// 이 클래스는 0 이 입력되면 발생되는 사용자 정의 예외를 처리해주는 클래스
		// 따라서 예외의 원인은 0이 입력되었다는 것을 알려주는 것이 되겠다.
		public String toString() {
			return "에러 : 0이 입력되었습니다.";
		}
	}
}
