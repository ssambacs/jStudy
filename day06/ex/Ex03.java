package day06.ex;

/*
 	 5�ڸ� ���ڸ� �����ϰ� �߻�
 	 �� �ڸ� ������ ���� ���ϴ� ���α׷�
 */

public class Ex03 {
	public static void main(String[] args) {
		int num = (int)(Math.random()* 90000 - 10000);
		int no = num;
		int result = 0;
		int no2 = 0;
		for(int i = 0 ; i < 5 ; i++) {
			
			no2 = no % 10;			
			result = result + no2;			
			no = no / 10;
			
		}
		System.out.println(num + " �� ���ڸ� ���� : " +result);
	}
}
