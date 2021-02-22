package day06.ex;

/*
 	문제2
 		달팽이가 전봇대를(100미터)에 올라간다.
 		낮에는 0.87미터를 올라가고
 		밤에는 0.35미터를 미끄러진다.
 		
 		몇일만에 이 달팽이는 정상에 올라갈 것인가?
 		단, 꼭대기에 올라가면 미끄럼은 없다.
 */
public class Ex02 {

	public static void main(String[] args) {
		double mt = 0;
		int day = 0;
		boolean complete = false;
		
		for(int i = 1 ; ; i++) {
			day = i;
			mt = mt + 0.87;
			
			if (mt >= 100) {
				complete = true;
				break;
			}
			mt = mt - 0.35;
		
		 
		}
		if(complete) {// complete ==> true
			System.out.println(" 반복문 중간에 종료!!!");
		}
		System.out.println(day + "일 " + mt);

	}

}
