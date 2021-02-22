package day06;

/*
 	1 ~ 10 까지 곱한 결과를 출력하세요
 	
 	팩토리알 : 해당 자연수까지의 곱
 	
 	3! : 1*2*3
 	7! : 1*2*3*4*5*6*7
 */
public class Test03 {
	public static void main(String[] args) {
		int result = 1;
		for(int i = 1 ; i < 8 ; i++) {
			result = result * i;
			
		}
		System.out.println("1부터 7까지의 곱은 " + result);
	}
}
