package day06.ex;

/*
 	1.
 		주사위 두개를 던져서 합이 6이 나오는 경우를 모두 출력하세요.
 		
 			a	b
 			1	1
 				2
 				.
 				.
 				.
 				6
 			2	1
 				.
 				.
 				.
 				6
 				
 	2.
 		두자리의 랜덤한 숫자 10개를 발생시켜서 합을 구하는 프로그램을 작성하세요
 		
 	3.
 		1 ~ 100 까지의 합을 구하는데 홀수만의 합을 구하세요
 	
 	4. 
 		첫날은 1원을 저축하고 다음날은 전날의 2배를 저축한다면
 		몇일째 1억원을 저축할 수 있을지 출력해주는 프로그램을 작성
 */
public class Ex04 {
	public static void main(String[] args) {
		int sum = 0;
		String result = " | ";
			for(int i = 1; i < 7 ; i++ ) {
				for(int j = 1 ; j < 7 ; j++ ) {
					sum = i + j;
					if(sum == 6) {
						result =result + i+ " : " + j + " | " ;  
						System.out.print(result );
			        }
				}
			}
		
	}
}
