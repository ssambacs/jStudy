package day10.ex;

import java.util.Arrays;

/*
 	반지름을 입력(정수)하면 입력한 정수를 반지름으로 하는 원의 
 	둘레, 넓이를 한꺼번에 반환해주는 함수(setCircle)를 만들고 실행해서 결과를 출력하세요.
 	반지름은 15~45 사이로 랜덤하게 입력되게 하세요.  
 */
public class Ex01 {
	double pai = 3.14;
	
	public Ex01() {
		int rad = (int)(Math.random()*31 + 15);
		
		double[] result = setCircle(rad);
		
		System.out.println("반지름 : "+ rad + " 의 둘레와 넓이는 " + Arrays.toString(result));
		
	}
	public static void main(String[] args) {
		new Ex01();

	}
	double[] setCircle(int a) {
		double[] no = new double[2];
		no[0] = 2* a * pai;
		no[1] = a * a * pai;		
		return no;
	}

}
