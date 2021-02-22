package day06;

/*
 	5개의 메모리를 배열로 만들고
 	그 안에 랜덤한 숫자(정수)를 입력한 후 출력하자.
 */
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		// 주소를 기억할 변수를 준비
		int[] num = new int[6];
		
		/*
		 * num[0] = (int)(Math.random()*45 +1 ); num[1] = (int)(Math.random()*45 +1 );
		 * num[2] = (int)(Math.random()*45 +1 ); num[3] = (int)(Math.random()*45 +1 );
		 * num[4] = (int)(Math.random()*45 +1 ); num[5] = (int)(Math.random()*45 +1 );
		 */
		
		for(int i = 0; i < 6; i++) {
			num[i] = (int)(Math.random()*45 +1);
		}
		
		
		// 출력
		/*
		 * System.out.println(num[0]); 
		 * System.out.println(num[1]);
		 * System.out.println(num[2]);
		 * System.out.println(num[3]);
		 * System.out.println(num[4]); 
		 * System.out.println(num[5]);
		 */
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + " | ");	
		}
		System.out.println();
		
		  String str = Arrays.toString(num); 
		  System.out.println(Arrays.toString(num));
		  System.out.println(str);
		 
	}
}
