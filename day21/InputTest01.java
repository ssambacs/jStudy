package day21;


/*
 	키보드를 이용해서 문자를 입력 받아보자
 */

import java.io.*;
import java.util.*;

public class InputTest01 {

	public InputTest01() {
	
		/*
		 	참고
		 		키보드 역시 외부장치이다.
		 		자주 사용하는 외부장치이기 때문에
		 		이미 스트림을 준비한 변수가 존재한다.
		 		그것이 바로 
		 			System.in
		 		이다.
		 */
		
		int ch = 0;
		
		try {
			/*
			//1.
			System.out.print("한글자 입력 : ");
			ch = System.in.read();
			//출력
			System.out.println("입력한 문자1 : " + (char)ch);
			System.out.println("입력한 문자2 : " + ch);
			*/
			
			/*
			// 2. 문자열 입력
			System.out.print("적당히 입력 : ");
			// 읽은 결과를 기억할 변수를 준비한다.
			byte[] buff = new byte[256];
			// 이때 256이라고 입력한 부분의 숫자에 따라서 한번에 읽을 데이터의 양이 결정이 된다.
			int len = System.in.read(buff);
			// 읽은 결과를 문자로 변환해서 출력....
			String str = new String(buff, 0, len);
			System.out.println("입력한 문자열 : " + str);
			*/
			
			// 3. 주로 네트워크 처리할때 많이 사용하는 방법 
			System.out.print("적당히 입력 : ");
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			int len = System.in.read(buff, 10, 100);
			/*
			 	준비된 배열 buff에 10번방부터 읽은 내용을 기억하세요
			 	최대 100개까지만 읽으세요.(==> 100자만 입력받는다.)
			 */
			 String str = new String(buff, 0, len + 10);
			 System.out.println("입력한 문자열 :" + str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InputTest01() ;

	}

}
