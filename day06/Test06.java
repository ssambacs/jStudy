package day06;

/*
 	5 학생의 점수(정수)를 랜덤하게 입력한 후
 	총점과 평균을 구해서 출력하세요
 	
 	단, 학생의 점수를 배열로 처리하세요
 */
public class Test06 {
	public static void main(String[] args) {
		// 배열변수 만들고
		int[] score = new int[5];
		
		// 평균변수
		int total = 0;
		double avg = 0.0;
		
		// 다섯명 점수 입력
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = (int)(Math.random()*41 + 60);
		}
		// 총점을 구한다.
		for(int i = 0 ; i < score.length ; i++) {
			total = total + score[i];
		}
		// 평균을 구한다.
		avg = total / (double)score.length;
		/*
		 	배열의 크기에 관계되는 내용은
		 	될 수 있으면
		 		배열주소.length
		 	를 이용해서 처리하도록 한다.
		 */
		
		// 출력하다.
		for(int no : score) {
			System.out.print(no + ", ");
		}
		System.out.println();
		
		System.out.println("총점 : "  + total);
		System.out.println("평균 : "  + avg);
	}
	/*
	 	심화학습
	 		위 문제를 정수 여섯개를 관리하는 배열로 만들고
	 		맨 마지막 방에는 총점을 관리하도록 해서
	 		이 문제를 처리해 보세요.
	 */
}
