package day17;

import java.util.*;
public class Test05 {

	public Test05() {
//		int no = null; // 기본형 변수에는 null을 사용할 수 없다. 참조형타이에만 사용할 수 있다.
		
		// 난수 10ㅐ를 만들어서 출력해보자.
		Random rdn = new Random(100);
		for(int i = 0 ; i< 10; i++) {
			System.out.print(rdn.nextInt() + ", ");
		}
		System.out.println();
		
		rdn = new Random(100);
		for(int i = 0 ; i< 10; i++) {
			System.out.print(rdn.nextInt() + ", ");
		}
	}

	public static void main(String[] args) {
		new Test05();

	}

}
