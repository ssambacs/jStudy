package day06;

/*
  	-1	+ 2 -3 +4 -5.......
  	처음 100을 넘기는 결과가 나오는 회차를 출력
 */
public class Test02 {
	public static void main(String[] args) {
		
		int sum = 0;
		int gop = -1;
		int num = 0;
		
		for(int i = 1; ; i++) { // 이렇게 조건식에 아무것도 기술하지 않으면 항상 true
			gop = gop * -1;
			int no = i * gop;
			sum = sum + (i * gop);
			
			num = i;
			if(sum > 100) break;
			// if문의 경우 이렇게 블럭안의 내용이 명령이 하나인 경우는 불럭기호를 생략 가능
		}
		System.out.println(num + " 회차 : 합계 " + sum);
	}
}
