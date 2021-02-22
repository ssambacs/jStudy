package day06.ex;
/*
4.
	첫날은 1원을 저축하고 다음날은 전날의 2배를 저축한다면
	몇일째 1억원을 저축할 수 있을지 출력해주는 프로그램을 작성
*/
public class Ex0404 {
	public static void main(String[] args) {
		int money = 1;
		int save = 1;
		int day = 2;
		while(true) {
			
			money = money*2;
			save = save + money;

			
			if(money >= 100000000) {
				break;
			}
		day++;
		}		
		System.out.println(money + " 급액 " + day);
}
}