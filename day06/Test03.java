package day06;

/*
 	1 ~ 10 ���� ���� ����� ����ϼ���
 	
 	���丮�� : �ش� �ڿ��������� ��
 	
 	3! : 1*2*3
 	7! : 1*2*3*4*5*6*7
 */
public class Test03 {
	public static void main(String[] args) {
		int result = 1;
		for(int i = 1 ; i < 8 ; i++) {
			result = result * i;
			
		}
		System.out.println("1���� 7������ ���� " + result);
	}
}
