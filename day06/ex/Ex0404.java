package day06.ex;
/*
4.
	ù���� 1���� �����ϰ� �������� ������ 2�踦 �����Ѵٸ�
	����° 1����� ������ �� ������ ������ִ� ���α׷��� �ۼ�
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
		System.out.println(money + " �޾� " + day);
}
}