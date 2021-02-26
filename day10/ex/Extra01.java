package day10.ex;

/*
  학생수랑 과목수 배열 
  랜덤점수
  총점 배열 
  출력
 */
public class Extra01 {
	
	int[][] score = new int[3][4];
	int[] sum = new int[3];
	
	
	public Extra01() {
		
	}
	public static void main(String[] args) {
		new Extra01();
	}
	
	void setScore() {
		for(int i = 0; i < score.length ; i++ ) {
			for(int j = 0; j < score[i].length ; j++ ) {
				int no = (int)(Math.random()* 30 + 70);
				score[i][j] = no;
			}
		}
	}
	
	void setSum() {
		for(int i = 0; i < score.length ; i++ ) {
			for(int j = 0; j < score[i].length ; j++ ) {
				sum[i] +=score[i][j];
			}			
		}
	}
	
	void soo() {
		
	}
}
