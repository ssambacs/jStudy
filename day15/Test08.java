package day15;

import java.util.*;
public class Test08 {

	public Test08() {
		/*
		 현재 시간을 출력해보자.
		 자바에서 날짜를 관리하는 클래스는
		 	Date 라는 클래스가 있지만
		 현재는 calendar 버젼업 클래스가 만들어져서
		 이 클래스를 사용하기를 권장하고 있다.		  
		 */
		/*
		Date date = new Date();
		// 날짜 출력
		System.out.println(date.getDate()); // 이 함수는 Deprecated 되어있는 함수이고 되도록이면 사용하지 말자
		System.out.println(date.getDay());
		*/
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
